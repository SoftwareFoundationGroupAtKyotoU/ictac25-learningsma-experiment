#!/usr/bin/env python3
############################################################
# Name
#  print_table
# Description
#  Print aggregated benchmark results as plain-text or LaTeX
#  tables with configurable row order and benchmark name
#  mappings (\MH{}, \ATGS{}, \BMS{}). Also adds |SigmaE| and |m| to
#  all table outputs (auto-populated from aggregated data).
#
#  Supports two benchmark types:
#    --benchmark-type practical (default): existing practical benchmarks
#    --benchmark-type random: random s-MA benchmarks with n/|SigmaE| labels
#
# Usage
#  python3 scripts/print_table.py aggregated.json
#  python3 scripts/print_table.py aggregated.json --format text
#  python3 scripts/print_table.py aggregated.json --format latex
#  python3 scripts/print_table.py aggregated.json --format both
#  python3 scripts/print_table.py aggregated.json --benchmark-type random
#  python3 scripts/print_table.py aggregated.json --benchmark-type both
###########################################################

import argparse
import json
import re
import sys


# Benchmark name mapping for LaTeX display
LATEX_NAMES = {
    "FoxBMSPrechargeController": "\\BMS{}",
    "MarsHelicopter": "\\MH{}",
    "GearShift": "\\ATGS{}",
}

# Custom row order for LaTeX table
LATEX_ROW_ORDER = ["MarsHelicopter", "GearShift", "FoxBMSPrechargeController"]

# Random benchmark row order: sort by number of states (n), then by SigmaE parameter
def parse_random_metadata(benchmark_name):
    """Parse n (number of states) and SigmaE_param (input SigmaE parameter) from random benchmark names.
    
    Naming convention: Random{N}States{M}SigmaE{TIMESTAMP}
    where N = number of states, M = input SigmaE parameter.
    """
    match = re.match(r'Random(\d+)States(\d+)SigmaE', benchmark_name)
    if match:
        return {"n": int(match.group(1)), "SigmaE_param": int(match.group(2))}
    return {}


def get_random_row_order(data):
    """Sort random benchmarks by n (ascending), then by SigmaE_param (ascending)."""
    benched_list = []
    for bench_name in data:
        meta = parse_random_metadata(bench_name)
        if meta:
            benched_list.append(bench_name)
    benched_list.sort(key=lambda b: (parse_random_metadata(b)["n"], parse_random_metadata(b)["SigmaE_param"]))
    return benched_list


def read_data(input_file):
    """Read aggregated JSON data into dict with flat metric values."""
    with open(input_file, "r") as f:
        raw_data = json.load(f)

    data = {}
    for bench_name in raw_data:
        metrics = raw_data[bench_name]
        equiv_mean = metrics.get("equiv", {}).get("mean", 0) if isinstance(metrics.get("equiv"), dict) else 0
        equiv_var = metrics.get("equiv", {}).get("variance", 0) if isinstance(metrics.get("equiv"), dict) else 0
        output_mean = metrics.get("output", {}).get("mean", 0) if isinstance(metrics.get("output"), dict) else 0
        output_var = metrics.get("output", {}).get("variance", 0) if isinstance(metrics.get("output"), dict) else 0
        rt_mean_val = metrics.get("run_time", {}).get("mean", 0)
        rt_var_val = metrics.get("run_time", {}).get("variance", 0)
        R_mean = metrics.get("R", {}).get("mean", 0)
        R_var = metrics.get("R", {}).get("variance", 0)
        E_mean = metrics.get("E", {}).get("mean", 0)
        E_var = metrics.get("E", {}).get("variance", 0)
        SigmaE_mean = metrics.get("SigmaE", {}).get("mean", 0)
        SigmaE_var = metrics.get("SigmaE", {}).get("variance", 0)
        m_mean = metrics.get("m", {}).get("mean", 0) if isinstance(metrics.get("m"), dict) else 0
        m_var = metrics.get("m", {}).get("variance", 0) if isinstance(metrics.get("m"), dict) else 0
        count = metrics.get("equiv", {}).get("count", 0) if isinstance(metrics.get("equiv"), dict) else 0

        rt_mean_sec = rt_mean_val / 1000.0 if isinstance(rt_mean_val, (int, float)) else 0
        rt_var_sec = rt_var_val / 1e6 if isinstance(rt_var_val, (int, float)) else 0

        data[bench_name] = {
            "equiv_mean": equiv_mean,
            "equiv_var": equiv_var,
            "output_mean": output_mean,
            "output_var": output_var,
            "rt_mean_sec": rt_mean_sec,
            "rt_var_sec": rt_var_sec,
            "R_mean": R_mean,
            "R_var": R_var,
            "E_mean": E_mean,
            "E_var": E_var,
            "SigmaE_mean": SigmaE_mean,
            "SigmaE_var": SigmaE_var,
            "m_mean": m_mean,
            "m_var": m_var,
            "count": count,
        }
    return data


def make_text_table(data):
    """Create a plain-text table from aggregated data (practical benchmarks)."""
    rows = []
    for bench_name in sorted(data.keys()):
        m = data[bench_name]
        rows.append([
            bench_name,
            m["equiv_mean"],
            m["output_mean"],
            m["rt_mean_sec"],
            m["R_mean"],
            m["E_mean"],
            m["SigmaE_mean"],
            m["m_mean"],
            m["count"],
        ])

    headers = ["Benchmark", "equiv", "output", "run_time(s)", "R", "E", "SigmaE", "m", "count"]
    widths = [len(h) for h in headers]
    for row in rows:
        for i, val in enumerate(row):
            if isinstance(val, (int, float)):
                display = f"{val:.4g}"
                widths[i] = max(widths[i], len(display))
            else:
                widths[i] = max(widths[i], len(str(val)))

    SEP = " | "
    dash_sep = SEP.join("-" * widths[i] for i in range(len(headers)))
    lines = [
        SEP.join(f"{headers[i]:^{widths[i]}}" for i in range(len(headers))),
        dash_sep,
    ]

    for row in rows:
        cols = []
        for i, val in enumerate(row):
            if isinstance(val, (int, float)):
                cols.append(f"{val:.4g}".rjust(widths[i]))
            else:
                cols.append(str(val).rjust(widths[i]))
        lines.append(SEP.join(cols))
    lines.append(dash_sep)

    return "\n".join(lines)


def make_random_text_table(data):
    """Create a plain-text table from aggregated data (random benchmarks)."""
    all_benches = sorted(data.keys())
    random_benches = [b for b in all_benches if parse_random_metadata(b)]
    order = get_random_row_order(data)
    non_random = [b for b in all_benches if b not in set(random_benches)]
    row_benches = order + non_random

    rows = []
    filtered = row_benches = order
    for bench_name in filtered:
        if bench_name not in data:
            continue
        meta = parse_random_metadata(bench_name)
        if not meta:
            continue
        n = meta["n"]
        sigmae = meta["SigmaE_param"]
        m = data[bench_name]
        rows.append([
            n,
            sigmae,
            m["equiv_mean"],
            m["output_mean"],
            m["rt_mean_sec"],
            m["SigmaE_mean"],
            m["R_mean"],
            m["E_mean"],
            m["m_mean"],
            m["count"],
        ])

    headers = ["n", "|SigmaE|", "# of eq.", "# of oq.", "time [s.]", "|SigmaEf|", "|R|", "|E|", "m", "# of iters."]
    widths = [len(h) for h in headers]
    for row in rows:
        for i, val in enumerate(row):
            if isinstance(val, (int, float)):
                if i in (0, 1, 2, 3, 5, 6, 7, 8, 9):
                    display = f"{val:.0f}"
                else:
                    display = f"{val:.4g}"
                widths[i] = max(widths[i], len(display))
            else:
                widths[i] = max(widths[i], len(str(val)))

    SEP = " | "
    dash_sep = SEP.join("-" * widths[i] for i in range(len(headers)))
    lines = [
        SEP.join(f"{headers[i]:^{widths[i]}}" for i in range(len(headers))),
        dash_sep,
    ]

    for row in rows:
        cols = []
        for i, val in enumerate(row):
            if isinstance(val, (int, float)):
                if i in (0, 1, 2, 3, 5, 6, 7, 8, 9):
                    cols.append(f"{val:.0f}".rjust(widths[i]))
                else:
                    cols.append(f"{val:.4g}".rjust(widths[i]))
            else:
                cols.append(str(val).rjust(widths[i]))
        lines.append(SEP.join(cols))
    lines.append(dash_sep)

    return "\n".join(lines)


def fmt(val, decimals=1):
    """Format a number for LaTeX with 1 decimal place."""
    return f"{val:.{decimals}f}"


def format_latex_table(data):
    """Create a LaTeX table matching the user's specified format (practical benchmarks)."""
    col_format = "lccccccccccc"

    lines = [
        r"\begin{table}[!ht]",
        r"\centering",
        r"\renewcommand{\arraystretch}{1.3}",
        r"\begin{tabular}{" + col_format + "}",
        r"\toprule",
    ]

    # Header row
    header = (
        r"{} & "
        + r"$|\Gamma|$ & "
        + r"$n$ & "
        + r"$|\delta|$ & "
        + r"\#B. & "
        + r"\#N. & "
        + r"\# of eq. & "
        + r"\# of oq. & "
        + r"time [s.] & "
        + r"$|\SigmaEf|$ & "
        + r"$|R|$ & "
        + r"$|E|$ & "
        + r"$m$"
        + r" \\ \midrule"
    )
    lines.append(header)

    # Determine row order: custom order first, then alphabetical for any extras
    all_benches = sorted(data.keys())
    if all(b in LATEX_ROW_ORDER for b in all_benches):
        row_benches = list(LATEX_ROW_ORDER)
        # Only include those that exist in our data
        row_benches = [b for b in row_benches if b in data]
        # Append any benchmarks not in LATEX_ROW_ORDER
        remaining = [b for b in all_benches if b not in row_benches]
        row_benches.extend(remaining)
    else:
        row_benches = all_benches

    for bench_idx, bench_name in enumerate(row_benches):
        if bench_name not in data:
            continue
        m = data[bench_name]
        latex_name = LATEX_NAMES.get(bench_name, bench_name)

        # Columns: |\Gamma| (empty), n (empty), |\delta| (empty), \#B. (empty), \#N. (empty), \# of eq., \# of oq., time [s.], |\SigmaEf|, |R|, |E|, m
        line = (
            f"{latex_name} & "
            + " & "  # |\Gamma|
            + " & "  # n
            + " & "  # |\delta|
            + " & "  # \#B.
            + " & "  # \#N.
            + f"{fmt(m['equiv_mean'])} & "  # \# of eq.
            + f"{fmt(m['output_mean'])} & "  # \# of oq.
            + f"{fmt(m['rt_mean_sec'])} & "  # time [s.]
            + f"{fmt(m['SigmaE_mean'])} & "  # |\SigmaEf|
            + f"{fmt(m['R_mean'])} & "  # |R|
            + f"{fmt(m['E_mean'])} & "  # |E|
            + f"{fmt(m['m_mean'])}"  # m
        )
        lines.append(line + r" \\")

    lines.append(r"\bottomrule")
    lines.append(r"\end{tabular}")
    lines.append(r"\caption{Aggregated benchmark results: mean and variance per metric.}")
    lines.append(r"\label{tab:benchmark-results}")
    lines.append(r"\end{table}")

    return "\n".join(lines)


def format_random_latex_table(data):
    """Create a LaTeX table for random benchmarks with mean/variance columns."""
    col_format = "cc|cccccccccc"

    lines = [
        r"\begin{table}[!ht]",
        r"\centering",
        r"\renewcommand{\arraystretch}{1.3}",
        r"\begin{tabular}{" + col_format + "}",
        r"\toprule",
    ]

    # Two-level header without requiring \multirow for the parameter columns.
    header = (
        r"\multicolumn{2}{c|}{Parameters} & "
        + r"\multicolumn{6}{c|}{Mean} & "
        + r"\multicolumn{4}{c}{Variance} \\ "
    )
    header += (
        r"$n$ & $|\Sigma Ef|$ & \# of eq. & \# of oq. & $|R|$ & $|E|$ & $m$ & time [s.] & \# of eq. & \# of oq. & $|R|$ & $|E|$ \\ "
        + r"\midrule"
    )
    lines.append(header)

    # Determine row order: random benchmarks sorted by n, then SigmaE_param
    all_benches = sorted(data.keys())
    random_benches = [b for b in all_benches if parse_random_metadata(b)]
    non_random_benches = [b for b in all_benches if b not in set(random_benches)]
    order = get_random_row_order(data)
    row_benches = order + non_random_benches

    for bench_idx, bench_name in enumerate(row_benches):
        if bench_name not in data:
            continue
        meta = parse_random_metadata(bench_name)
        if not meta:
            continue
        m = data[bench_name]
        n = meta["n"]
        sigmae = meta["SigmaE_param"]

        line = (
            f"{n} & "
            + f"{sigmae} & "
            + f"{fmt(m['equiv_mean'])} & "
            + f"{fmt(m['output_mean'])} & "
            + f"{fmt(m['R_mean'])} & "
            + f"{fmt(m['E_mean'])} & "
            + f"{fmt(m['m_mean'])} & "
            + f"{fmt(m['rt_mean_sec'])} & "
            + f"{fmt(m['equiv_var'])} & "
            + f"{fmt(m['output_var'])} & "
            + f"{fmt(m['R_var'])} & "
            + f"{fmt(m['E_var'])}"
        )
        lines.append(line + r" \\")

    lines.append(r"\bottomrule")
    lines.append(r"\end{tabular}")
    lines.append(r"\caption{Aggregated random benchmark results: mean and variance per metric.}")
    lines.append(r"\label{tab:random-benchmark-results}")
    lines.append(r"\end{table}")

    return "\n".join(lines)


def main():
    parser = argparse.ArgumentParser(
        description="Print aggregated benchmark results as tables."
    )
    parser.add_argument("input_file", help="Path to aggregated JSON file")
    parser.add_argument("--format", choices=["text", "latex", "both"],
                        default="both", help="Output format (default: both)")
    parser.add_argument("--benchmark-type", choices=["practical", "random", "both"],
                        default="both", help="Benchmark type: practical, random, or both (default: both)")
    args = parser.parse_args()

    data = read_data(args.input_file)

    if args.format in ("text", "both"):
        if args.benchmark_type in ("practical", "both"):
            text_out = make_text_table(data)
            if args.format == "both":
                print(text_out)
                print()
            else:
                print(text_out)
        if args.benchmark_type in ("random", "both"):
            text_out = make_random_text_table(data)
            if args.format == "both":
                print(text_out)
                print()
            else:
                print(text_out)

    if args.format in ("latex", "both"):
        if args.benchmark_type in ("practical", "both"):
            latex_out = format_latex_table(data)
            if args.format == "both":
                print()
                print("-" * 80)
                print()
            print(latex_out)
        if args.benchmark_type in ("random", "both"):
            latex_out = format_random_latex_table(data)
            if args.format == "both":
                print()
                print("-" * 80)
                print()
            print(latex_out)


if __name__ == "__main__":
    main()
