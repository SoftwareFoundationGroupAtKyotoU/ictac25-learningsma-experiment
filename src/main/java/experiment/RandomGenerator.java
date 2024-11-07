package experiment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomGenerator {
  public static void main(String[] args) {
    try {
      int numberOfStates = Integer.parseInt(args[0]);// the number of states
      int numberOfSigmaE = Integer.parseInt(args[1]); // the number of  Sigma_E
      String dirname = args[2];
      String classname = args[3];
      String filename = "./src/main/java//experiment/"+ dirname+ "/" + classname;
      File file = new File(filename + ".java");
      FileWriter filewriter = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(filewriter);
      PrintWriter pw = new PrintWriter(bw);
      List<Character> output = new ArrayList<Character>();
      output.add('a');
      output.add('b');
      output.add('c');
      int numberOfOutput = 3;
      pw.println("package experiment." + dirname + ";");
      pw.println("import java.util.ArrayList;" + "\n"
          + "\n" + "import java.util.Arrays;"
          + "\n" + "import java.util.List;"
          + "\n" + "import org.sat4j.specs.TimeoutException;"
          + "\n" + "import learning.symbolicmealy.SymbolicMealyAutomatonLearner;"
          + "\n" + "import learning.symbolicmealy.SymbolicMealyAutomatonOracle;"
          + "\n" + "import symbolicmealy.SMAInputMove;"
          + "\n" + "import symbolicmealy.SymbolicMealyAutomaton;"
          + "\n" + "import automata.sfa.SFAMove;"
          + "\n" + "import theory.BooleanAlgebra;"
          + "\n" + "import theory.ProductAlgebra;"
          + "\n" + "import theory.cartesian.CartesianProduct;"
          + "\n" + "import theory.intervals.BoundedIntegerSolver;"
          + "\n" + "import theory.intervals.IntegerSolver;"
          + "\n" + "import theory.intervals.IntPred;"
          + "\n" + "import utilities.Pair;");
      pw.println("public class " + classname + "{");
      pw.println("public static void main(String[] args){");
      pw.println("try{");
      pw.println("BooleanAlgebra<IntPred, Integer> ba1 = new BoundedIntegerSolver(0, null);");
      pw.println(
          "SymbolicMealyAutomatonLearner<IntPred, Integer, Character> learner = new SymbolicMealyAutomatonLearner<IntPred, Integer, Character>(true);");
      pw.println("Integer init = 1;");
      pw.println("List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();");
      for (int i = 1; i <= numberOfStates; i++) {
        pw.println("trans.addAll(createTransitionsState" + i + "());");
      }


      pw.println(
          "SymbolicMealyAutomaton<IntPred, Integer, Character> example1 = SymbolicMealyAutomaton.MkSMA(trans,init,ba1);");
          pw.println(
              "example1 = SymbolicMealyAutomaton.getNormalized(example1,ba1);");
              pw.println(
                  "example1 = SymbolicMealyAutomaton.getClean(example1,ba1);");
              pw.println("example1 = SymbolicMealyAutomaton.getMinimal(example1, ba1);");
      pw.println(
          "SymbolicMealyAutomatonOracle<IntPred, Integer, Character> oracle = new SymbolicMealyAutomatonOracle<IntPred, Integer, Character>(example1,ba1);");
      pw.println("SymbolicMealyAutomaton<IntPred, Integer, Character> learned = learner.learn(oracle, ba1);");
      pw.println("} catch (TimeoutException e) {");
      pw.println("}");
      pw.println("}");
      Random random = new Random();

        // generate random partitions
        Integer lower = 1;
        Integer upper;
        List<Integer> partitions = new ArrayList<Integer>();
        partitions.add(0);
        for (int i = 0; i < numberOfSigmaE - 1; i++) {
          upper = random.nextInt(100) + lower;
          lower = upper + 1;
          partitions.add(upper);
        }

        Integer initialState = 1;
        for (Integer fromState = initialState; fromState <= numberOfStates; fromState++) {
          pw.println("private static List<SFAMove<IntPred, Integer>> createTransitionsState" + fromState + "() {");
          pw.println("List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();");
          Integer toState;
          for (int i = 0; i < partitions.size() - 1; i++) {
            toState = random.nextInt(numberOfStates) + 1;

            pw.printf("trans.add(new SMAInputMove<IntPred, Integer, Character>(%s, %s, new IntPred(%s, %s), '%s'));",
                fromState,
                toState, partitions.get(i), partitions.get(i + 1) - 1, output.get(random.nextInt(numberOfOutput)));
            pw.println();

          }
          toState = random.nextInt(numberOfStates) + 1;

          pw.printf("trans.add(new SMAInputMove<IntPred, Integer, Character>(%s, %s, new IntPred(%s, %s), '%s'));",
              fromState,
              toState, partitions.get(partitions.size() - 1), "null", output.get(random.nextInt(numberOfOutput)));
          pw.println();
          pw.println("return trans;");
          pw.println("}");
          pw.println();
        }

      pw.println("}");
      pw.close();
    } catch (IOException e) {

    }
  }
}
