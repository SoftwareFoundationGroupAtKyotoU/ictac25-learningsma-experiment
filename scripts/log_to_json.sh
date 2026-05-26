#!/usr/bin/env bash
############################################################
# Name
#  log_to_json.sh — Transform a log file into a JSON object.
# Description
#  Transform an experimental log file into a JSON object with
#  benchmark identification, timestamp, and extracted metrics
#  (run_time, equiv, output, R, E, SigmaE, m).
#
# Usage
#  ./scripts/log_to_json.sh <log_file>
#  ./scripts/log_to_json.sh <log_file> <benchmark> <timestamp>
#  # Combine multiple logs into one JSON array:
#  for log in log_dir/*/bench*.log; do
#    ./scripts/log_to_json.sh "$log"
#  done | jq -s '.' > results.json
############################################################

set -euo pipefail

if [[ $# -lt 1 ]]; then
    echo "Usage: $0 <log_file> [benchmark] [timestamp]" >&2
    exit 1
fi

LOG_FILE="$1"

if [[ ! -f "$LOG_FILE" ]]; then
    echo "error: file not found: $LOG_FILE" >&2
    exit 1
fi

# Auto-derive benchmark from directory name
# - practical: <benchmark>_<datetime>_run<N>  -> <benchmark>
# - random:    <benchmark>_<datetime>          -> <benchmark>
if [[ -z "${2:-}" ]]; then
    DIRNAME=$(basename "$(dirname "$LOG_FILE")")
    DIRNAME_CLEAN=$(echo "$DIRNAME" | sed 's/_run[0-9]*$//')
    DIRNAME_CLEAN=$(echo "$DIRNAME_CLEAN" | sed 's/_[0-9]\{14\}$//')
    BENCH="$DIRNAME_CLEAN"
else
    BENCH="$2"
fi

# Auto-derive timestamp from log filename
if [[ -z "${3:-}" ]]; then
    LOGNAME=$(basename "$LOG_FILE" .log)
    TIMESTAMP=$(echo "$LOGNAME" | grep -oE '[0-9]{14}' | head -1 || true)
    TIMESTAMP="${TIMESTAMP:-$(date -u +%Y%m%d%H%M%S)}"
else
    TIMESTAMP="$3"
fi

# Parse log lines into fields
RUN_TIME=0
EQUIV=0
OUTPUT=0
RES_SIZE=0
ERROR_SIZE=0
SIGMA_E=0
M_SIZE=0

while IFS= read -r line || [[ -n "$line" ]]; do
    case "$line" in
        '# run time:'*)
            VALUE=$(echo "$line" | sed 's/^# run time:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            RUN_TIME="$VALUE"
            ;;
        '# equiv:'*)
            VALUE=$(echo "$line" | sed 's/^# equiv:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            EQUIV="$VALUE"
            ;;
        '# output:'*)
            VALUE=$(echo "$line" | sed 's/^# output:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            OUTPUT="$VALUE"
            ;;
        '|R|:'*)
            VALUE=$(echo "$line" | sed 's/^|R|:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            RES_SIZE="$VALUE"
            ;;
        '|E|:'*)
            VALUE=$(echo "$line" | sed 's/^|E|:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            ERROR_SIZE="$VALUE"
            ;;
        '|SigmaE|:'*)
            VALUE=$(echo "$line" | sed 's/^|SigmaE|:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            SIGMA_E="$VALUE"
            ;;
        '|m|:'*)
            VALUE=$(echo "$line" | sed 's/^|m|:[[:space:]]*//' | grep -oE '[0-9]+' | head -1)
            M_SIZE="$VALUE"
            ;;
    esac
done < "$LOG_FILE"

# Build JSON output using jq to maintain proper types (string vs number)
jq -n \
    --arg b "$BENCH" \
    --arg t "$TIMESTAMP" \
    --arg f "$LOG_FILE" \
    --argjson rt "$RUN_TIME" \
    --argjson eq "$EQUIV" \
    --argjson ou "$OUTPUT" \
    --argjson rs "$RES_SIZE" \
    --argjson es "$ERROR_SIZE" \
    --argjson se "$SIGMA_E" \
    --argjson m_size "$M_SIZE" \
    '{
        "benchmark": $b,
        "timestamp": $t,
        "log_file": $f,
        "run_time": $rt,
        "equiv": $eq,
        "output": $ou,
        "R": $rs,
        "E": $es,
        "SigmaE": $se,
        "m": $m_size
    }'
