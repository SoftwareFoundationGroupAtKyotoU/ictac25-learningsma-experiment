# Learning Symbolic Mealy Automata - Experiment Reproduction

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](./LICENSE)

This repository contains the implementation and experimental setup for evaluating the Learning Symbolic Mealy Automata (LearningSMA) algorithm. The experiments include both practical case studies with real-world models and random experiments with varying parameters.

## Prerequisites

- Java JDK 8
- Maven

## Project Structure

- `src/main/java/experiment/`: Contains the Java source code for the experiments
  - `RandomGenerator.java`: Generates random Symbolic Mealy Automata for experiments
  - `practical/`: Contains implementations of practical case studies
  - Various directories with random experiment implementations
- `lib/`: Contains the required JAR files
  - `learningsma-1.0-SNAPSHOT.jar`: The LearningSMA implementation
  - `models-1.0.jar`: Models used in the experiments
- Shell scripts for running experiments:
  - `practical_experiment.sh`: Runs the full practical experiments
  - `random_experiment.sh`: Runs the full random experiments
  - `reproduce_practical_experiment.sh`: Reproduces the practical experiments
  - `subset_practical_experiment.sh`: Runs a subset of the practical experiments
  - `subset_random_experiment.sh`: Runs a subset of the random experiments
- `experiment-result.ipynb`: Jupyter notebook for analyzing and visualizing the results

## Models

The practical experiments use two real-world models:

1. **Mars Helicopter**: A model of the Mars helicopter control system with 5 states
2. **Gear Shift**: An automatic transmission gear shift controller with 16 states

The random experiments generate automata with varying parameters:
- Number of states: 10, 20, 40, or 80
- Alphabet size (SigmaE): 10, 20, 30, or 40

## Running the Experiments

### Initial Setup

```bash
# Clean and build the project
mvn clean install

### Full Experiment Reproduction

To run the full set of experiments (this may take several hours to days depending on your hardware):

```bash
# For practical experiments (runs each model 10 times)
./practical_experiment.sh

# For random experiments (runs all configurations with multiple iterations)
./random_experiment.sh
```

### Subset Experiment Reproduction

For a quicker evaluation with a subset of the experiments (recommended for initial testing):

```bash
# For a subset of practical experiments (runs each model once)
./subset_practical_experiment.sh

# For a subset of random experiments (runs fewer configurations)
./subset_random_experiment.sh
```

## Experiment Results

The experiment results are stored in the following directories:
- Practical experiments: `practical_experiment_log/`
- Random experiments: In their respective directories under `src/main/java/experiment/`

You can analyze the results using the `experiment-result.ipynb` notebook, which calculates:
- Average number of equivalence queries
- Average number of output queries
- Average run time
- Average sizes of R, SigmaE, and E sets

The notebook also generates plots showing the relationship between:
- Number of states and number of output queries
- Alphabet size and number of output queries

## Detailed Instructions

### Running Full Experiments

The full experiments run all test cases with multiple iterations to ensure statistical significance. This process is comprehensive but time-consuming.

1. Ensure Maven is installed and configured
2. Run the full practical experiment:
   ```bash
   ./practical_experiment.sh
   ```
   This will:
   - Compile all Java files in the practical directory
   - Execute each practical model 10 times
   - Store logs in the `practical_experiment_log` directory

3. Run the full random experiment:
   ```bash
   ./random_experiment.sh
   ```
   This will:
   - Generate random automata with various configurations
   - Run learning experiments on each generated automaton
   - Store results in their respective directories

### Running Subset Experiments

For quicker evaluation or initial testing, you can run a subset of the experiments:

1. For practical experiments:
   ```bash
   ./subset_practical_experiment.sh
   ```
   This runs each practical model once instead of 10 times.

2. For random experiments:
   ```bash
   ./subset_random_experiment.sh
   ```
   This runs a smaller set of random configurations with fewer iterations.

## Analyzing Results

After running the experiments, you can analyze the results:

1. Open the `experiment-result.ipynb` notebook using Jupyter
2. Run all cells to generate statistics and plots
3. The notebook will calculate averages for all metrics and generate visualizations

## References

This implementation is based on the LearningSMA algorithm for learning Symbolic Mealy Automata. The practical models (Mars Helicopter and Gear Shift) represent real-world control systems with symbolic inputs and outputs.
