#!/bin/bash

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"

# Run learning experiments on a selected subset of pre-generated Random s-MA models
# Usage:
#   ./random_sma_selective_experiment.sh                        # picks first available in each existing directory
#   ./random_sma_selective_experiment.sh 160                    # picks first available for each sigmaE with 40 states
#   ./random_sma_selective_experiment.sh "Random10States10*"    # glob pattern
#   ./random_sma_selective_experiment.sh "Random10States10*/*"  # explicit dir list

# Specify the number of iterations per selected s-MA
numberOfIterations=1

# Use provided argument as pattern, otherwise default to all
pattern="${1:-Random*/}"

mvn compile

matches=($pattern)
count=${#matches[@]}

if [ "$count" -eq 0 ] || [ ! -d "${matches[0]}" ]; then
  echo "No directories found matching: $pattern"
  exit 1
fi

echo "Running experiments on $count directory(ies):"
for dir in "${matches[@]}"; do
  [ -d "$dir" ] || continue
  dirName=$(basename "$dir")
  echo "  -> $dirName"
  
  # Find s-MA .java files in this directory
  for file in "$dir"/*.java; do
    className=$(basename "$file" .java)
    # Skip if not actually a file
    [ -f "$file" ] || continue
    # Skip if the class is an Average report file
    [[ "$className" == Average* ]] && continue
    
    experimentDir="${dir}/${className}"
    mkdir -p "$experimentDir"
    
    for ((i = 1; i <= numberOfIterations; i++)); do
      timestamp=$(date +"%Y%m%d%H%M%S")
      mvn -q exec:java -Dexec.mainClass=experiment."$dirName"."$className" > \
        "${experimentDir}/${className}-${timestamp}.log" 2>&1
    done
  done
done
