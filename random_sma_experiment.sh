#!/bin/bash

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"

# Run learning experiments on pre-generated Random s-MA models
# Scans src/main/java/experiment/ for generated s-MA directories and runs experiments

# Specify the number of iterations per generated s-MA
numberOfIterations=10

mvn compile

# Find all generated s-MA directories (those containing .java files)
for dir in ./src/main/java/experiment/Random*/; do
  # Skip if no matching directories found
  [ -d "$dir" ] || continue
  
  dirName=$(basename "$dir")
  # Skip directories that look like temporary partial ones
  [[ ! "$dirName" =~ ^Random[0-9]+States ]] && continue
  
  echo "== Running experiments on $dirName =="
  
  # Find s-MA files in this directory
  for file in "$dir"*.java; do
    className=$(basename "$file" .java)
    experimentDir="${dir}${className}"
    mkdir -p "$experimentDir"
    for ((i = 1; i <= numberOfIterations; i++)); do
      timestamp=$(date +"%Y%m%d%H%M%S")
      mvn -q exec:java -Dexec.mainClass=experiment."$dirName"."$className" > "${experimentDir}/${className}-${timestamp}.log"
    done
  done
done
