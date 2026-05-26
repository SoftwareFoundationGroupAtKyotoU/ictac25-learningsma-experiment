#!/usr/bin/env python3
############################################################
# Name
#  aggregate
# Description
#  Read a JSON array of experimental log entries (output of
#  log_to_json.sh), group them by benchmark, and compute the
#  mean and variance for each metric (run_time, equiv, output,
#  R, E, SigmaE, m). For random benchmarks (names matching
#  Random{N}States{M}SigmaE{timestamp}), also adds n and
#  SigmaE_param metadata fields. Outputs a summarized JSON file.
#  Use --group-random-config to aggregate all generated random
#  benchmarks with the same (N, M) parameters together.
#
# Usage
#  python3 scripts/aggregate.py results.json
#  python3 scripts/aggregate.py results.json -o aggregated.json
#  python3 scripts/aggregate.py random_results.json --group-random-config -o random_aggregated.json
###########################################################

import argparse
import json
import re
import sys


RANDOM_BENCHMARK_RE = re.compile(r'^Random(\d+)States(\d+)SigmaE(?:\d{14})?$')


def parse_random_metadata(benchmark_name):
    """Parse n (number of states) and SigmaE_param (input SigmaE parameter) from random benchmark names."""
    match = RANDOM_BENCHMARK_RE.match(benchmark_name)
    if match:
        return {"n": int(match.group(1)), "SigmaE_param": int(match.group(2))}
    return {}


def random_config_name(benchmark_name):
    """Return Random{N}States{M}SigmaE for generated random benchmark names."""
    match = RANDOM_BENCHMARK_RE.match(benchmark_name)
    if not match:
        return benchmark_name
    return f"Random{match.group(1)}States{match.group(2)}SigmaE"


def main():
    parser = argparse.ArgumentParser(
        description="Aggregate log results by benchmark."
    )
    parser.add_argument("input_file", help="Path to JSON array of log entries")
    parser.add_argument("-o", "--output", default="aggregated.json",
                        help="Output aggregated JSON file (default: aggregated.json)")
    parser.add_argument("--group-random-config", action="store_true",
                        help=("Group generated random benchmarks by configuration, "
                              "e.g. Random10States20SigmaE20260527120000 -> "
                              "Random10States20SigmaE"))
    args = parser.parse_args()

    with open(args.input_file, "r") as f:
        data = json.load(f)

    # Collect entries grouped by benchmark
    benchmarks = {}
    source_benchmarks = {}
    for entry in data:
        original_bench = entry["benchmark"]
        bench = random_config_name(original_bench) if args.group_random_config else original_bench
        if bench not in benchmarks:
            benchmarks[bench] = []
            source_benchmarks[bench] = set()
        benchmarks[bench].append(entry)
        source_benchmarks[bench].add(original_bench)

    # Metrics to aggregate
    metrics = ["run_time", "equiv", "output", "R", "E", "SigmaE", "m"]

    # Compute mean and variance per benchmark per metric
    aggregated = {}
    for bench, entries in sorted(benchmarks.items()):
        aggregated[bench] = parse_random_metadata(bench)
        if args.group_random_config and aggregated[bench]:
            aggregated[bench]["generated_benchmark_count"] = len(source_benchmarks[bench])
        for metric in metrics:
            values = [e.get(metric, 0) for e in entries]
            n = len(values)
            if n == 0:
                mean_val = 0.0
                var_val = 0.0
            elif n == 1:
                mean_val = float(values[0])
                var_val = 0.0
            else:
                mean_val = sum(values) / n
                # Sample variance (ddof=1) if n >= 2, else population (ddof=0)
                var_val = sum((v - mean_val) ** 2 for v in values) / (n - 1)
            aggregated[bench][metric] = {
                "mean": round(mean_val, 6),
                "variance": round(var_val, 6),
                "count": n
            }

    with open(args.output, "w") as f:
        json.dump(aggregated, f, indent=2)

    print(f"Wrote aggregated results to {args.output}")
    print(f"  Benchmarks: {list(aggregated.keys())}")
    for bench, entries in benchmarks.items():
        print(f"  {bench}: {len(entries)} samples")

if __name__ == "__main__":
    main()
