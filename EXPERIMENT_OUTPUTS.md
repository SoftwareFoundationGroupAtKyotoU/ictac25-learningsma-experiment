# Experiment Outputs

This document defines what each experiment prints to stdout and what files it
generates.

## Common Learning Summary

Successful learning runs print the same summary format:

```text
# run time: <milliseconds> ms
# equiv: <equivalence query count>
# output: <output query count>
|R|: <observation table R size>
|E|: <observation table E size>
```

The `# run time` line is emitted by the LearningSMA learner. The remaining
summary lines are emitted by the experiment code after learning completes.

By default, observation-table statistics are captured without forwarding the
full learner debug output. Set `-Dsma.table.stats=false` to disable table-stat
capture; in that case `|R|` and `|E|` are printed as `unknown`. Set
`-Dsma.learner.debug=true` to forward the learner's verbose debug output in
addition to the summary.

FoxBMS has additional optional diagnostics. Set `-Dfox.diag=true` to print
`[FOX_DIAG]` progress lines. Those lines are diagnostic-only and are not part of
the summary contract above.

## Practical Experiments

The practical benchmark classes are:

- `experiment.practical.MarsHelicopter`
- `experiment.practical.GearShift`
- `experiment.practical.FoxBMSPrechargeController`

Each normal practical run prints the common learning summary to stdout.

Each normal practical run also writes DOT files in the repository root. Existing
files with the same names are overwritten:

| Benchmark | Target DOT | Learned DOT |
| --- | --- | --- |
| MarsHelicopter | `marsHelicopter.dot` | `learnedMarsHelicopter.dot` |
| GearShift | `gearShift.dot` | `learnedGearShift.dot` |
| FoxBMSPrechargeController | `foxBMSPrechargeController.dot` | `learnedFoxBMSPrechargeController.dot` |

The practical runner scripts redirect stdout into log files:

| Script | Log directory pattern |
| --- | --- |
| `practical_experiment.sh` | `practical_experiment_log/practical_experiment_logs_<timestamp>/<Benchmark>_<timestamp>/<Benchmark>_<timestamp>.log` |
| `subset_practical_experiment.sh` | `practical_experiment_log/subset_practical_experiment_logs_<timestamp>/<Benchmark>_<timestamp>/<Benchmark>_<timestamp>.log` |
| `reproduce_practical_experiment.sh` | `practical_experiment_log/reproduce_practical_experiment_logs_<timestamp>/<Benchmark>_<timestamp>/<Benchmark>_<timestamp>.log` |

The scripts use quiet Maven execution for benchmark runs, so the log files are
intended to contain benchmark output rather than Maven build noise.

Smoke-test runs use the `--smoke` argument. They print a single smoke-test
success line instead of the learning summary. They write only the target DOT
file, not the learned DOT file.

## Random Experiments

Random benchmark classes are generated under:

```text
src/main/java/experiment/<RandomExperimentDir>/<RandomClass>.java
```

Examples:

```text
src/main/java/experiment/Random80States20SigmaE20240826035332/Random80States20SigmaE20240826035332.java
src/main/java/experiment/SubsetRandom10States10SigmaE<timestamp>/SubsetRandom10States10SigmaE<timestamp>.java
```

Running a random benchmark class prints the common learning summary to stdout.
Random benchmark runs do not write target or learned DOT files.

The random-generation phase creates Java source files:

| Script | Generated files |
| --- | --- |
| `random_sma_generate.sh` | `src/main/java/experiment/Random<states>States<sigmaE>SigmaE<timestamp>/Random<states>States<sigmaE>SigmaE<timestamp>.java` |
| `random_experiment.sh` | Same pattern, then runs the generated classes |
| `subset_random_experiment.sh` | `src/main/java/experiment/SubsetRandom<states>States<sigmaE>SigmaE<timestamp>/SubsetRandom<states>States<sigmaE>SigmaE<timestamp>.java` |

The random runner scripts write run logs under each generated experiment
directory:

| Script | Log directory pattern |
| --- | --- |
| `random_experiment.sh` | `src/main/java/experiment/<RandomExperimentDir>/<RandomClass>/<RandomClass>-<timestamp>.log` |
| `subset_random_experiment.sh` | `src/main/java/experiment/<SubsetRandomExperimentDir>/<SubsetRandomClass>/<SubsetRandomClass>-<timestamp>.log` |
| `random_sma_experiment.sh` | `src/main/java/experiment/<RandomExperimentDir>/<RandomClass>/<RandomClass>-<timestamp>.log` |
| `random_sma_selective_experiment.sh` | `src/main/java/experiment/<RandomExperimentDir>/<RandomClass>/<RandomClass>-<timestamp>.log` |

The runner scripts use quiet Maven execution for benchmark runs, so those logs
are intended to contain the common learning summary rather than Maven build
noise.

## Analysis Artifacts

The benchmark classes and shell runners do not compute aggregate statistics.
They produce the raw logs plus the source and DOT artifacts described above.
Aggregate files such as `Average*.txt`, output-query plots, and PDF/PNG figures
are produced by analysis workflows such as `experiment-result.ipynb` or helper
scripts, not by the benchmark classes themselves.

To aggregate generated random benchmarks by configuration, use:

```bash
python3 scripts/aggregate.py random_experiment_log/summary.json \
  --group-random-config \
  -o random_experiment_log/aggregated_by_config.json
```

This groups names such as `Random10States20SigmaE20260527120000` under
`Random10States20SigmaE`, so the ten generated benchmarks for the same
`(states, SigmaE)` configuration are summarized together.
