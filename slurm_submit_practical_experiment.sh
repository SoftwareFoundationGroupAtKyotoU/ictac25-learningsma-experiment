#!/bin/bash

set -euo pipefail

usage() {
  cat <<'USAGE'
Usage: ./slurm_submit_practical_experiment.sh [--dry-run] [--array-range RANGE]

Submit the practical experiments to Slurm.

Options:
  --dry-run, --list       Print the array tasks without compiling or submitting.
  --array-range RANGE     Submit only this Slurm array range, e.g. 1, 1-3, or 1-30%5.
  -h, --help              Show this help.

Environment:
  NUM_EXECUTIONS          Repetitions per benchmark. Default: 10.
USAGE
}

script_dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
repo_root="$script_dir"
num_executions="${NUM_EXECUTIONS:-10}"
dry_run=false
array_range=""

while [[ $# -gt 0 ]]; do
  case "$1" in
    --dry-run|--list)
      dry_run=true
      ;;
    --array-range)
      shift
      if [[ $# -eq 0 ]]; then
        echo "Missing value for --array-range" >&2
        exit 2
      fi
      array_range="$1"
      ;;
    -h|--help)
      usage
      exit 0
      ;;
    *)
      echo "Unknown argument: $1" >&2
      usage >&2
      exit 2
      ;;
  esac
  shift
done

if ! [[ "$num_executions" =~ ^[0-9]+$ ]] || [[ "$num_executions" -lt 1 ]]; then
  echo "NUM_EXECUTIONS must be a positive integer." >&2
  exit 2
fi

cd "$repo_root"

mapfile -t practical_files < <(find "$repo_root/src/main/java/experiment/practical" -maxdepth 1 -type f -name '*.java' | sort)
if [[ "${#practical_files[@]}" -eq 0 ]]; then
  echo "No practical Java files found." >&2
  exit 1
fi

tasks=()
for file in "${practical_files[@]}"; do
  benchmark="$(basename "$file" .java)"
  for ((i = 1; i <= num_executions; i++)); do
    tasks+=("${benchmark}"$'\t'"${i}")
  done
done

if [[ "$dry_run" == true ]]; then
  echo "Practical Slurm tasks: ${#tasks[@]}"
  printf '%s\n' "${tasks[@]}"
  exit 0
fi

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"
mvn compile

timestamp="$(date +%Y%m%d%H%M%S)"
manifest_dir="$repo_root/.slurm/manifests"
slurm_log_dir="$repo_root/.slurm/logs"
output_root="$repo_root/practical_experiment_log/slurm_practical_experiment_logs_${timestamp}"
manifest="$manifest_dir/practical_${timestamp}.tsv"

mkdir -p "$manifest_dir" "$slurm_log_dir" "$output_root"
printf '%s\n' "${tasks[@]}" > "$manifest"

array_spec="${array_range:-1-${#tasks[@]}}"
sbatch --array="$array_spec" "$repo_root/slurm_practical_experiment.sbatch" "$manifest" "$output_root" "$repo_root"
