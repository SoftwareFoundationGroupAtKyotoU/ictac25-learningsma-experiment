#!/bin/bash

set -euo pipefail

usage() {
  cat <<'USAGE'
Usage: ./slurm_submit_random_sma_experiment.sh [--dry-run] [--array-range RANGE] [DIR_GLOB]

Submit experiments for pre-generated random s-MA Java classes to Slurm.

Arguments:
  DIR_GLOB                Optional directory-name glob such as 'Random10States*'.
                          Default: 'Random*States*SigmaE*'.

Options:
  --dry-run, --list       Print the array tasks without compiling or submitting.
  --array-range RANGE     Submit only this Slurm array range, e.g. 1, 1-3, or 1-200%10.
  -h, --help              Show this help.

Environment:
  NUMBER_OF_ITERATIONS    Repetitions per random class. Default: 10.
USAGE
}

script_dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
repo_root="$script_dir"
number_of_iterations="${NUMBER_OF_ITERATIONS:-10}"
dry_run=false
array_range=""
dir_glob="Random*States*SigmaE*"

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
    -*)
      echo "Unknown option: $1" >&2
      usage >&2
      exit 2
      ;;
    *)
      dir_glob="$1"
      ;;
  esac
  shift
done

if ! [[ "$number_of_iterations" =~ ^[0-9]+$ ]] || [[ "$number_of_iterations" -lt 1 ]]; then
  echo "NUMBER_OF_ITERATIONS must be a positive integer." >&2
  exit 2
fi

cd "$repo_root"

tasks=()
while IFS= read -r dir; do
  dir_name="$(basename "$dir")"
  [[ "$dir_name" =~ ^Random[0-9]+States[0-9]+SigmaE ]] || continue
  [[ "$dir_name" == $dir_glob ]] || continue

  shopt -s nullglob
  java_files=("$dir"/*.java)
  shopt -u nullglob
  for file in "${java_files[@]}"; do
    class_name="$(basename "$file" .java)"
    [[ "$class_name" == Average* ]] && continue
    tasks+=("${dir_name}"$'\t'"${class_name}")
  done
done < <(find "$repo_root/src/main/java/experiment" -mindepth 1 -maxdepth 1 -type d -name 'Random*States*SigmaE*' | sort)

if [[ "${#tasks[@]}" -eq 0 ]]; then
  echo "No random s-MA Java classes found for directory glob: $dir_glob" >&2
  exit 1
fi

if [[ "$dry_run" == true ]]; then
  echo "Random s-MA Slurm tasks: ${#tasks[@]} classes, ${number_of_iterations} iterations each"
  printf '%s\n' "${tasks[@]}"
  exit 0
fi

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"
mvn compile

timestamp="$(date +%Y%m%d%H%M%S)"
manifest_dir="$repo_root/.slurm/manifests"
slurm_log_dir="$repo_root/.slurm/logs"
manifest="$manifest_dir/random_sma_${timestamp}.tsv"

mkdir -p "$manifest_dir" "$slurm_log_dir"
printf '%s\n' "${tasks[@]}" > "$manifest"

array_spec="${array_range:-1-${#tasks[@]}}"
sbatch --array="$array_spec" "$repo_root/slurm_random_sma_experiment.sbatch" "$manifest" "$repo_root" "$number_of_iterations"
