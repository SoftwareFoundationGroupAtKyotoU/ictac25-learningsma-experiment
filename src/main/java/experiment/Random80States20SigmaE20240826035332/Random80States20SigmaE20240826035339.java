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
public class Random80States20SigmaE20240826035339{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 65, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 76, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 68, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 60, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 77, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 45, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 50, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 54, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 52, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 72, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 54, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 73, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 61, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 70, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 54, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 62, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 23, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 75, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 43, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 67, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 72, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 63, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 43, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 44, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 65, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 76, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 55, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 42, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 72, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 43, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 42, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 23, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 64, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 47, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 67, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 73, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 69, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 48, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 73, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 68, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 54, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 42, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 47, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 74, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 80, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 67, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 41, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 75, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 69, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 80, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 59, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 48, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 71, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 46, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 76, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 58, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 73, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 54, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 50, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 57, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 72, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 52, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 53, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 51, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 48, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 43, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 55, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 41, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 64, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 51, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 52, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 73, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 71, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 43, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 43, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 74, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 77, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 56, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 80, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 51, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 53, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 76, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 48, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 51, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 65, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 51, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 72, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 62, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 43, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 75, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 59, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 55, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 53, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 56, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 34, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 30, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 39, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 11, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 74, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 35, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 27, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 74, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 59, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 63, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 58, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 39, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 11, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 43, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 70, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 36, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 70, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 53, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 12, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 53, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 67, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 33, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 67, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 22, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 48, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 48, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 36, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 21, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 5, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 27, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 69, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 30, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 67, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 21, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 49, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 22, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 64, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 19, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 39, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 69, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 58, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 21, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 18, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 8, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 74, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 50, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 6, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 55, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 56, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 4, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 68, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 74, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 35, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 29, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 52, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 29, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 29, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 42, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 6, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 53, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 13, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 24, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 63, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 31, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 44, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 41, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 44, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 13, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 52, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 13, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 22, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 12, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 36, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 79, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 32, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 20, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 19, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 71, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 1, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 49, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 78, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 50, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 6, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 36, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 40, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 41, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 43, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 56, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 53, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 56, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 48, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 52, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 32, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 2, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 45, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 62, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 35, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 43, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 57, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 48, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 25, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 29, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 55, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 45, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 78, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 30, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 38, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 19, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 10, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 67, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 25, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 8, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 35, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 73, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 27, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 19, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 64, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 67, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 47, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 22, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 22, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 61, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 1, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 65, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 77, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 24, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 22, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 61, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 77, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 25, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 67, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 68, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 7, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 77, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 77, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 58, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 17, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(223, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 40, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 25, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 79, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 33, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 24, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 30, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 65, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 76, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 21, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 28, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 30, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 71, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 39, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 16, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 6, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 34, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 1, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 66, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 45, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 5, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 76, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 37, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 43, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 65, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 13, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 29, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 72, new IntPred(138, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 75, new IntPred(482, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 36, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 3, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 39, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 13, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 50, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(666, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(1111, 1145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 32, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 44, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 25, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(615, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(822, 906), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 24, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 6, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(1146, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 80, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(615, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(907, 1003), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 46, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(508, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 46, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 64, new IntPred(695, 741), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 62, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(1004, 1042), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 72, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 52, new IntPred(1081, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(304, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(528, 614), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(907, 1003), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 17, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(68, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 47, new IntPred(223, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(304, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(384, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(528, 614), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 74, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(666, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(742, 821), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(1043, 1080), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(1146, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 35, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(68, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(138, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(384, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(482, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(508, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 70, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(695, 741), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(742, 821), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(822, 906), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 70, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(1004, 1042), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 55, new IntPred(1043, 1080), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 6, new IntPred(1081, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(1111, 1145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(1146, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 9, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(68, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(138, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(223, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(304, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(384, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 37, new IntPred(482, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 23, new IntPred(508, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(528, 614), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(615, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(666, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(695, 741), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(742, 821), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(822, 906), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 31, new IntPred(907, 1003), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(1004, 1042), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(1043, 1080), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(1081, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 37, new IntPred(1111, 1145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(1146, null), 'a'));
return trans;
}

}
