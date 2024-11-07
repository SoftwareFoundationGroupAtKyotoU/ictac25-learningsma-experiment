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
public class Random80States20SigmaE20240826035336{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 80, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 80, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 79, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 43, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 60, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 57, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 47, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 78, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 42, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 48, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 57, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 50, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 79, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 51, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 57, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 44, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 48, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 57, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 69, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 53, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 72, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 54, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 66, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 60, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 57, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 63, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 53, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 63, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 79, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 79, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 71, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 71, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 69, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 62, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 53, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 63, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 63, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 42, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 44, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 41, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 67, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 67, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 66, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 23, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 68, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 77, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 63, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 44, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 61, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 67, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 74, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 60, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 41, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 72, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 76, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 57, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 70, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 79, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 56, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 70, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 57, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 76, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 55, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 74, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 74, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 68, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 73, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 73, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 50, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 51, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 80, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 77, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 77, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 52, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 56, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 73, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 57, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 41, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 59, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 56, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 65, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 48, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 43, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 71, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 70, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 46, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 62, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 71, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 46, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 78, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 50, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 59, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 73, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 65, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 72, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 54, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 70, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 70, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 65, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 50, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 79, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 66, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 58, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 42, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 71, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 79, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 66, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 51, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 41, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 75, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 34, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 15, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 49, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 55, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 80, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 23, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 15, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 53, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 19, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 26, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 74, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 9, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 22, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 21, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 33, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 11, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 5, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 59, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 30, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 64, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 73, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 43, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 64, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 57, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 73, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 41, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 1, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 34, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 36, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 25, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 9, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 53, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 57, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 32, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 69, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 28, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 48, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 41, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 40, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 44, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 80, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 31, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 6, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 70, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 6, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 43, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 3, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 70, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 70, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 39, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 8, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 11, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 56, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 9, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 50, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 19, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 14, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 33, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 11, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 35, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 49, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 74, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 71, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 69, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 53, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 69, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 48, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 45, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 16, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 75, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 44, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 78, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 31, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 44, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 55, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 39, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 11, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 27, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 54, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 11, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 11, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 75, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 79, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 39, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 67, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 19, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 69, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 32, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 36, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 44, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 61, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 55, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 26, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 2, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 56, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 68, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 27, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 28, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 18, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 70, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 33, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 28, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 68, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 41, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 50, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 63, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 55, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 64, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 31, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 11, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 65, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 45, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 58, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 65, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 72, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 44, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 25, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 53, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 26, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 78, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 78, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 62, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 29, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 29, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 73, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 67, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 29, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 31, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 2, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 2, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 44, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 33, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 58, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 16, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 37, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 52, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 65, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 74, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 48, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 76, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 1, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 37, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 16, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 48, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 31, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 3, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 8, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 8, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 60, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 25, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 17, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 65, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 40, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 12, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 4, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 27, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 66, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 47, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 66, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 66, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 34, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 40, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 31, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 29, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 20, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 21, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 16, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 15, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 80, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 80, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 44, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 47, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 49, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 42, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 55, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 5, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 20, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 61, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 36, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 53, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 79, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 36, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 33, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 55, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 50, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 38, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 17, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 53, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(746, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(908, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 12, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 18, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 15, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 61, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 76, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 15, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(849, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 43, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 36, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 21, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 1, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 35, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(207, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 15, new IntPred(240, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(329, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 32, new IntPred(707, 729), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(835, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(861, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 7, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(2, 26), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(109, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(329, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(420, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 79, new IntPred(482, 563), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 58, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(634, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 36, new IntPred(675, 706), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 71, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(730, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 79, new IntPred(765, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(2, 26), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(27, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(109, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 55, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(240, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(482, 563), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(564, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(634, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 21, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 7, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 42, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(908, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(27, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 26, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(207, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(420, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(564, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 57, new IntPred(675, 706), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(707, 729), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(730, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(746, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(765, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 14, new IntPred(835, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(849, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(861, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(908, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 9, new IntPred(2, 26), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(27, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(109, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(207, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 18, new IntPred(240, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(329, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(420, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 13, new IntPred(482, 563), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 73, new IntPred(564, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 5, new IntPred(634, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 29, new IntPred(675, 706), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 39, new IntPred(707, 729), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(730, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(746, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 56, new IntPred(765, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(835, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(849, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(861, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(908, null), 'c'));
return trans;
}

}
