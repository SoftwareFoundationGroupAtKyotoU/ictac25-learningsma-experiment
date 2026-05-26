#!/bin/bash
#SBATCH --job-name=sma-practical
#SBATCH --cpus-per-task=4
#SBATCH --mem=64G
#SBATCH --output=.slurm/logs/%x_%A_%a.out
#SBATCH --error=.slurm/logs/%x_%A_%a.err

set -euo pipefail

if [[ $# -ne 3 ]]; then
  echo "Usage: sbatch --array=1-N slurm_practical_experiment.sbatch MANIFEST OUTPUT_ROOT REPO_ROOT" >&2
  exit 2
fi

if [[ -z "${SLURM_ARRAY_TASK_ID:-}" ]]; then
  echo "SLURM_ARRAY_TASK_ID is not set; submit this script as a Slurm array job." >&2
  exit 2
fi

manifest="$1"
output_root="$2"
repo_root="$3"

line="$(sed -n "${SLURM_ARRAY_TASK_ID}p" "$manifest")"
if [[ -z "$line" ]]; then
  echo "No manifest row for SLURM_ARRAY_TASK_ID=${SLURM_ARRAY_TASK_ID}" >&2
  exit 2
fi

IFS=$'\t' read -r benchmark iteration <<< "$line"
if [[ -z "${benchmark:-}" || -z "${iteration:-}" ]]; then
  echo "Invalid manifest row: $line" >&2
  exit 2
fi

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"

timestamp="$(date +%Y%m%d%H%M%S)"
run_dir="$output_root/${benchmark}_${timestamp}_run${iteration}"
log_file="$run_dir/${benchmark}_${timestamp}.log"

mkdir -p "$run_dir"
cd "$run_dir"

mvn -q -f "$repo_root/pom.xml" exec:java -Dexec.mainClass="experiment.practical.${benchmark}" > "$log_file"
