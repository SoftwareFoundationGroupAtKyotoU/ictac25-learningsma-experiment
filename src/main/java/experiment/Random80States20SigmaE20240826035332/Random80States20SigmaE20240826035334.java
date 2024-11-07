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
public class Random80States20SigmaE20240826035334{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 77, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 44, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 66, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 67, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 60, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 64, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 71, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 52, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 48, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 76, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 69, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 74, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 53, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 69, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 49, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 78, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 62, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 78, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 53, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 61, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 79, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 48, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 61, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 48, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 58, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 44, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 73, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 49, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 76, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 60, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 72, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 61, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 44, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 50, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 66, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 67, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 64, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 50, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 66, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 50, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 74, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 59, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 42, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 63, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 67, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 65, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 65, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 41, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 41, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 54, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 77, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 46, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 52, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 79, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 46, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 50, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 43, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 43, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 61, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 54, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 46, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 77, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 48, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 80, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 70, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 62, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 50, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 50, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 66, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 70, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 70, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 54, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 44, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 60, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 77, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 9, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 72, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 59, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 54, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 48, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 72, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 69, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 55, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 59, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 64, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 45, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 52, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 74, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 69, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 41, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 60, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 62, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 63, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 64, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 74, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 48, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 53, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 48, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 69, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 47, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 56, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 52, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 44, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 65, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 56, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 79, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 55, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 64, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 63, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 78, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 70, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 69, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 51, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 51, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 67, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 67, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 45, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 44, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 51, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 55, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 36, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 56, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 39, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 27, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 72, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 3, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 72, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 31, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 33, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 47, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 36, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 68, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 26, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 9, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 41, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 20, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 36, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 20, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 41, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 15, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 47, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 17, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 11, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 79, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 18, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 36, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 19, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 10, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 48, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 46, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 1, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 44, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 1, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 62, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 36, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 74, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 8, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 26, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 31, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 18, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 17, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 18, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 50, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 43, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 62, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 26, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 66, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 70, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 47, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 63, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 24, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 40, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 4, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 77, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 11, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 46, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 45, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 16, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 24, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 41, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 37, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 78, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 56, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 24, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 71, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 1, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 45, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 56, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 69, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 31, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 71, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 19, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 55, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 32, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 19, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 27, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 40, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 18, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 22, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 71, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 55, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 60, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 40, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 65, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 13, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 40, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 11, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 31, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 66, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 44, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 16, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 59, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 68, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 53, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 13, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 42, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 72, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 27, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 42, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 12, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 42, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 26, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 16, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 12, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 8, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 37, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 63, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 38, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 59, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 6, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 63, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 64, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 49, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 30, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 58, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 38, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 3, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 53, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(823, 909), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 45, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 75, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 56, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 49, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 62, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 14, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 33, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 36, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 50, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 72, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 68, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 71, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 32, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 28, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 22, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(1049, 1081), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 40, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 60, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 47, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(1082, 1129), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 46, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 62, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 1, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(79, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 40, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 25, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 1, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 42, new IntPred(413, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(656, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 20, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 79, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 25, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 26, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 50, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 36, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 63, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 14, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 72, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 5, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 63, new IntPred(910, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(1130, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 50, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(79, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 53, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(321, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(652, 655), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(741, 822), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 67, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 80, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 76, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 42, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 53, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 18, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 67, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 54, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 28, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 38, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 22, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 79, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(413, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 28, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(522, 588), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 44, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 60, new IntPred(1082, 1129), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 14, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 52, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 39, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 72, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 62, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 74, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 7, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 5, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(361, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(589, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 64, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 21, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 41, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(162, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(228, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(321, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(331, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 56, new IntPred(361, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 8, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(500, 521), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(589, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 21, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 1, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 74, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(986, 1048), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(1049, 1081), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 6, new IntPred(1130, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 66, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(162, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 78, new IntPred(228, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(331, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 54, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 78, new IntPred(500, 521), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(522, 588), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 37, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 51, new IntPred(652, 655), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(656, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(741, 822), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(823, 909), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(910, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 6, new IntPred(986, 1048), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(1130, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(79, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 16, new IntPred(162, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 47, new IntPred(228, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 42, new IntPred(321, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(331, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(361, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 46, new IntPred(413, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(500, 521), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 48, new IntPred(522, 588), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(589, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(652, 655), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(656, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 63, new IntPred(741, 822), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 51, new IntPred(823, 909), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(910, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 20, new IntPred(986, 1048), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(1049, 1081), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 29, new IntPred(1082, 1129), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 53, new IntPred(1130, null), 'a'));
return trans;
}

}
