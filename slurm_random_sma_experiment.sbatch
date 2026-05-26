#!/bin/bash
#SBATCH --job-name=sma-random
#SBATCH --cpus-per-task=4
#SBATCH --mem=64G
#SBATCH --output=.slurm/logs/%x_%A_%a.out
#SBATCH --error=.slurm/logs/%x_%A_%a.err

set -euo pipefail

if [[ $# -ne 3 ]]; then
  echo "Usage: sbatch --array=1-N slurm_random_sma_experiment.sbatch MANIFEST REPO_ROOT NUMBER_OF_ITERATIONS" >&2
  exit 2
fi

if [[ -z "${SLURM_ARRAY_TASK_ID:-}" ]]; then
  echo "SLURM_ARRAY_TASK_ID is not set; submit this script as a Slurm array job." >&2
  exit 2
fi

manifest="$1"
repo_root="$2"
number_of_iterations="$3"

if ! [[ "$number_of_iterations" =~ ^[0-9]+$ ]] || [[ "$number_of_iterations" -lt 1 ]]; then
  echo "NUMBER_OF_ITERATIONS must be a positive integer." >&2
  exit 2
fi

line="$(sed -n "${SLURM_ARRAY_TASK_ID}p" "$manifest")"
if [[ -z "$line" ]]; then
  echo "No manifest row for SLURM_ARRAY_TASK_ID=${SLURM_ARRAY_TASK_ID}" >&2
  exit 2
fi

IFS=$'\t' read -r dir_name class_name <<< "$line"
if [[ -z "${dir_name:-}" || -z "${class_name:-}" ]]; then
  echo "Invalid manifest row: $line" >&2
  exit 2
fi

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"

experiment_dir="$repo_root/src/main/java/experiment/$dir_name/$class_name"
mkdir -p "$experiment_dir"
cd "$repo_root"

for ((i = 1; i <= number_of_iterations; i++)); do
  timestamp="$(date +"%Y%m%d%H%M%S")"
  mvn -q exec:java -Dexec.mainClass="experiment.${dir_name}.${class_name}" > "${experiment_dir}/${class_name}-${timestamp}.log"
done
