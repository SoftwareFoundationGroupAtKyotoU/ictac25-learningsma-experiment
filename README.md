# Learning Symbolic Mealy Automata - Experiment Reproduction

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](./LICENSE)

This repository contains the implementation and experimental setup for evaluating the Learning Symbolic Mealy Automata (LearningSMA) algorithm (https://github.com/SoftwareFoundationGroupAtKyotoU/learningsma). The experiments include both practical case studies with real-world models and random experiments with varying parameters.

## Prerequisites

- Java JDK 8 or newer. The Maven build targets Java 8 bytecode and has been verified to build and construct the practical models with JDK 8, 11, 17, 21, 25, and 26. JDK 26 is the highest version currently checked.
- Maven

## Expected Resources

These experiments run on a compute cluster (Slurm) and each run allocates **4 CPU cores and 64 GB RAM**.

| Item | Value |
| --- | --- |
| **OS** | Linux (Slurm cluster) |
| **CPU** | 4 cores per run |
| **RAM** | 64 GB per run (`MAVEN_OPTS=-Xmx64g`) |
| **Java** | JDK 8 or newer (verified: 8, 11, 17, 21, 25, 26) |
| **Maven** | 3.x |
| **Disk** | ~2 GB baseline (project + dependencies); full experiment outputs ~10-20 GB |

### Expected run times

Times vary significantly with hardware. Below are timing estimates **based on actual experimental logs** from a cluster node with 64 GB RAM and 4 CPU cores:

| Experiment | Subset | Full |
| --- | --- | --- |
| **Practical** (Mars Helicopter, Gear Shift, foxBMS) | ~3 s to ~12 min (1 run per model) | ~34 s to ~1 h 56 min (10 runs per model) |
| **Random** (20 state/SigmaE configurations) | ~0.1 s to ~24 min (1 run per configuration) | ~14 s to ~40 h per configuration (10 generated benchmarks, 10 runs each) |

The GearShift model dominates practical experiments at ~11.6 minutes per run on average. For full random experiments, time scales superlinearly with states and SigmaE: the largest configuration (120 states, 40 SigmaE) averages ~24 minutes per run, ~4 hours for 10 repeats of one generated benchmark, and ~40 hours for the full 100-run configuration. The total sequential runtime for all 20 random configurations in the latest logs is approximately **83 hours** (~3.4 days). Subset experiments (1 run per model / fewer configurations) are recommended for initial testing on a single workstation, while full runs benefit from cluster execution.

## Project Structure

- `src/main/java/experiment/`: Java experiment code, including `RandomGenerator.java`, the practical benchmark classes under `practical/`, and generated `Random*States*SigmaE*/` benchmark classes.
- `lib/`: Required pre-built JAR dependencies (`models-1.0.jar` and `learningsma-1.0-SNAPSHOT.jar`); see [`THIRD_PARTY.md`](./THIRD_PARTY.md).
- `*.dot`: Root-level DOT exports for the practical target automata and learned automata.
- `practical_experiment_log/`: Practical benchmark logs, per-run DOT copies, and checked-in JSON summaries for the latest Slurm batch.
- `random_experiment_log/`: Random benchmark logs, top-level `summary.json` and `aggregated.json`, plus TSV slices generated from the aggregate data.
- `scripts/`: Log parsing, JSON aggregation, and table-rendering helpers.
- `*_experiment.sh`, `random_sma_*.sh`, and `slurm_*.{sh,sbatch}`: Local, subset/reproduction, random s-MA, and Slurm runner scripts.
- `experiment-result.ipynb`: Jupyter notebook for result analysis and plotting.
- [`EXPERIMENT_OUTPUTS.md`](./EXPERIMENT_OUTPUTS.md): Reference for stdout, log, DOT, and summary artifact formats.

## Third-Party Dependencies

This project uses two pre-built JAR dependencies that are **not** part of this repository's source code.

### Rebuilding `models-1.0.jar`

```bash
git clone https://github.com/lorisdanto/symbolicautomata.git
cd symbolicautomata
git submodule update --init   # required to resolve all dependencies
cd models
mvn package
```

The rebuilt JAR will be at `models/target/models-1.0.jar`.

### Rebuilding `learningsma-1.0-SNAPSHOT.jar`

To build this JAR you need `models-1.0.jar` on your local Maven repository first:

```bash
# Step 1: Install models as a local Maven dependency
cd symbolicautomata/models
mvn install   # installs models-1.0.jar to local Maven repo (~/.m2/)

# Step 2: Build learningsma
cd ../../learningsma
mvn install
```

The JAR will be at `learningsma/target/learningsma-1.0-SNAPSHOT.jar`.

## Models

The practical experiments use three real-world models:

1. **Mars Helicopter**: A model of the Mars helicopter control system with 5 states ([DOT](./marsHelicopter.dot))
2. **Gear Shift**: An automatic transmission gear shift controller with 16 states ([DOT](./gearShift.dot))
3. **foxBMS**: A hand-crafted symbolic Mealy abstraction of the foxBMS 2 precharge/charge entry logic for a lithium-ion battery management system, with 15 states and a 3-dimensional symbolic input domain (cmd, currentAbs_mA, voltageDiff_mV) ([DOT](./foxBMSPrechargeController.dot))

The random experiments generate automata with varying parameters:
- Number of states: 10, 20, 40, 80, or 120
- Alphabet size (SigmaE): 10, 20, 30, or 40

## Running the Experiments

### Initial Setup

```bash
# Clean and build the project
mvn clean install
```

### Full Experiment Reproduction

To run the full set of experiments (this may take several hours to days depending on your hardware):

```bash
# Practical experiments on a local machine (runs each model 10 times)
./practical_experiment.sh

# Random experiments on pre-generated benchmark classes
./random_sma_experiment.sh

# Recommended on a Slurm cluster for the full random benchmark set
./slurm_submit_random_sma_experiment.sh
```

### Subset Experiment Reproduction

For a quicker evaluation with a subset of the experiments (recommended for initial testing):

```bash
# For a subset of practical experiments (runs each model once)
./subset_practical_experiment.sh

# For a subset of random experiments (runs fewer configurations)
./subset_random_experiment.sh

# For one generated local random configuration (80 states, SigmaE 20, 10x10 runs)
./random_experiment.sh
```

## Experiment Results

The checked-in result artifacts are stored in the following directories:

- `practical_experiment_log/`: Practical benchmark results. Slurm batches use `slurm_practical_experiment_logs_<timestamp>/`; each benchmark run directory contains the run `.log`, the target DOT file, and the learned DOT file. The latest checked-in Slurm batch also contains `summary.json` with one raw JSON entry per run and `aggregated.json` summarizing the 10 runs per practical benchmark.
- `random_experiment_log/`: Random benchmark results. Each `Random<states>States<sigmaE>SigmaE<timestamp>/` directory contains logs for one generated random benchmark. The top-level `summary.json` contains the raw parsed log entries, and `aggregated.json` groups them into the 20 `(states, SigmaE)` configurations used by the current results. The `mean_time_*.tsv` and `output_queries_*.tsv` files are generated slices of `aggregated.json`.

The stdout/log format and generated DOT/source artifacts are documented in
[`EXPERIMENT_OUTPUTS.md`](./EXPERIMENT_OUTPUTS.md).

You can analyze the results using the `experiment-result.ipynb` notebook or the helper scripts under `scripts/`. The available summaries cover:
- Average number of equivalence queries
- Average number of output queries
- Average run time
- Average sizes of R, SigmaE, and E sets

For script-based aggregation from JSON log summaries, use:

```bash
# Practical results
python3 scripts/aggregate.py \
  practical_experiment_log/slurm_practical_experiment_logs_20260530160005/summary.json \
  -o practical_experiment_log/slurm_practical_experiment_logs_20260530160005/aggregated.json
python3 scripts/print_table.py \
  practical_experiment_log/slurm_practical_experiment_logs_20260530160005/aggregated.json \
  --benchmark-type practical

# Random results, grouped by generated configuration
python3 scripts/aggregate.py random_experiment_log/summary.json \
  --group-random-config \
  -o random_experiment_log/aggregated.json
python3 scripts/print_table.py random_experiment_log/aggregated.json \
  --benchmark-type random

# Regenerate the random-result TSV slices
make -C random_experiment_log
```

The `--group-random-config` flag aggregates the ten generated random benchmarks
for each `(states, SigmaE)` configuration into one result row.

The notebook also generates plots showing the relationship between:
- Number of states and number of output queries
- Alphabet size and number of output queries

## Detailed Instructions

### Running Practical Experiments

The practical scripts compile the practical benchmark classes and run each model with `MAVEN_OPTS=-Xmx64g`.

1. Ensure Maven is installed and configured
2. Run the local full practical experiment:
   ```bash
   ./practical_experiment.sh
   ```
   This will:
   - Compile the Java files in `src/main/java/experiment/practical/`
   - Execute each practical model 10 times
   - Store logs under `practical_experiment_log/practical_experiment_logs_<timestamp>/`
   - Write the latest practical DOT exports at the repository root

3. For the Slurm version, use:
   ```bash
   ./slurm_submit_practical_experiment.sh
   ```
   This will:
   - Build one Slurm array task per practical benchmark run
   - Use `NUM_EXECUTIONS=10` by default
   - Store logs and per-run DOT files under `practical_experiment_log/slurm_practical_experiment_logs_<timestamp>/`

### Running Random Experiments

The current full random benchmark set is already generated under `src/main/java/experiment/Random*States*SigmaE*/`: 20 `(states, SigmaE)` configurations with 10 generated benchmarks each. The full run executes those pre-generated classes with multiple iterations.

1. Run the full pre-generated random benchmark set locally:
   ```bash
   ./random_sma_experiment.sh
   ```
   This scans `src/main/java/experiment/Random*/`, runs each generated class 10 times, and writes logs under `src/main/java/experiment/<RandomDir>/<RandomClass>/`.

2. For the recommended Slurm version, use:
   ```bash
   ./slurm_submit_random_sma_experiment.sh
   ```
   This creates a Slurm array over the generated random classes. Set `NUMBER_OF_ITERATIONS` to change the default 10 runs per class, for example:
   ```bash
   NUMBER_OF_ITERATIONS=1 ./slurm_submit_random_sma_experiment.sh --dry-run
   ```

3. To generate and run a new single local random configuration, use:
   ```bash
   ./random_experiment.sh
   ```
   This script currently generates 10 benchmarks for the hard-coded `(80 states, SigmaE 20)` configuration and runs each one 10 times. Edit `numberOfStates`, `numberOfSigmaE`, `numberOfGenerations`, and `numberOfIterations` in the script for a different local configuration.

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
   This generates one benchmark per configured subset parameter pair and runs each one once. The current script uses states `10, 20, 40, 80` and SigmaE `10, 20, 40, 80`; edit the arrays at the top of the script if you want the subset to mirror the checked-in result configurations.

## Analyzing Results

After running the experiments, you can analyze the results:

1. Open the `experiment-result.ipynb` notebook using Jupyter
2. Run all cells to generate statistics and plots
3. The notebook will calculate averages for all metrics and generate visualizations

## References

This implementation is based on the LearningSMA algorithm for learning Symbolic Mealy Automata. The practical models (Mars Helicopter, Gear Shift, and foxBMS) represent real-world control systems with symbolic inputs and outputs.
