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
public class Random80States20SigmaE20240826035332{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 67, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 71, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 52, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 54, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 49, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 42, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 54, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 78, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 57, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 62, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 66, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 75, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 43, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 77, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 75, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 60, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 71, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 65, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 53, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 79, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 49, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 48, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 67, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 75, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 67, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 59, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 42, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 48, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 72, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 71, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 48, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 32, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 60, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 56, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 59, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 42, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 50, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 69, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 44, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 69, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 58, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 74, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 55, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 47, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 47, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 41, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 69, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 53, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 73, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 80, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 75, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 67, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 75, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 69, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 73, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 58, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 67, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 67, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 66, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 73, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 57, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 70, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 77, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 71, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 51, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 46, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 54, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 74, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 58, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 79, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 42, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 54, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 41, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 55, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 65, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 76, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 71, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 77, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 59, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 47, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 72, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 74, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 71, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 65, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 78, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 73, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 48, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 80, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 62, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 80, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 62, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 65, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 54, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 65, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 77, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 79, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 80, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 62, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 44, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 63, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 36, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 8, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 34, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 5, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 74, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 5, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 33, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 80, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 64, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 19, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 35, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 79, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 53, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 47, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 30, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 9, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 42, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 20, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 13, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 57, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 5, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 32, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 35, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 25, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 23, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 52, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 67, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 10, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 68, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 19, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 80, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 30, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 80, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 49, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 36, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 52, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 17, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 34, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 30, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 21, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 12, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 32, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 2, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 7, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 63, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 7, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 66, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 69, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 14, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 60, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 65, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 37, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 51, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 24, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 37, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 48, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 47, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 71, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 47, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 25, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 48, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 74, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 57, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 66, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 52, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 28, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 16, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 44, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 26, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 36, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 6, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 32, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 40, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 75, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 19, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 21, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 32, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 37, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 44, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 17, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 59, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 76, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 6, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 76, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 2, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 9, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 39, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 80, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 34, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 56, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 8, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 23, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 35, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 46, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 46, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 62, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 16, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 25, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 44, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 34, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 19, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 60, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 10, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 2, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 9, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 8, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 58, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 34, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 53, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 54, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 41, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 47, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 20, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 19, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 44, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 22, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 30, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 22, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 26, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 53, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 71, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 2, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 27, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 6, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 59, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 9, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 56, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 31, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 67, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 13, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 11, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 73, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 8, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 7, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 31, new IntPred(437, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 79, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 10, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 25, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 30, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 44, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 44, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 59, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 12, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 24, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 39, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 70, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 1, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(698, 722), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 24, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 46, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 47, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 13, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 29, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 62, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 22, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 43, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 76, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 42, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 59, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 25, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 43, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 50, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 19, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 53, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 38, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(646, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 14, new IntPred(723, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 34, new IntPred(0, 94), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 52, new IntPred(95, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(186, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 54, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 6, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 61, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 5, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 5, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 43, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 49, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 68, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(757, 795), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 21, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 72, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(1069, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 7, new IntPred(265, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(404, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 46, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 64, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 21, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 74, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(251, 264), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 64, new IntPred(323, 403), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(698, 722), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(822, 874), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 51, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 29, new IntPred(531, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(550, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 36, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 1, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(757, 795), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(796, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(822, 874), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 2, new IntPred(875, 943), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(944, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(1012, 1068), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(1069, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(0, 94), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(95, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(186, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(251, 264), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 48, new IntPred(265, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(323, 403), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 55, new IntPred(404, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 44, new IntPred(437, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(531, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(550, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(646, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(723, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 70, new IntPred(796, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 18, new IntPred(875, 943), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(944, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(1012, 1068), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 38, new IntPred(1069, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 38, new IntPred(0, 94), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 71, new IntPred(95, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 39, new IntPred(186, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(251, 264), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(265, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(323, 403), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(404, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 79, new IntPred(437, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(531, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(550, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(646, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(698, 722), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(723, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(757, 795), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(796, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(822, 874), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(875, 943), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 6, new IntPred(944, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(1012, 1068), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 69, new IntPred(1069, null), 'c'));
return trans;
}

}
