#!/bin/bash

# Specify the number of states
numberOfStates=(10 20 40 80)
# Specify the number of Sigma_E
numberOfSigmaE=(10 20 40 80)
# Specify the number of generations
numberOfGenerations=1
# Specify the number of iterations
numberOfIterations=1

mvn install

# Generate the random automata
for states in "${numberOfStates[@]}"; do
  for sigmaE in "${numberOfSigmaE[@]}"; do
  # Get the current timestamp
  timestamp=$(date +"%Y%m%d%H%M%S")
  dirExperiment="SubsetRandom${states}States${sigmaE}SigmaE$timestamp"
  # Make the directory
  mkdir -p ./src/main/java/experiment/"$dirExperiment"
    for ((i = 1; i <= numberOfGenerations; i++)); do
      timestamp=$(date +"%Y%m%d%H%M%S")
      dirFile=SubsetRandom${states}States${sigmaE}SigmaE$timestamp
      mvn exec:java -Dexec.mainClass=experiment.RandomGenerator -Dexec.args="$states $sigmaE $dirExperiment $dirFile"
    done
    mvn compile
    # Run the experiments
  for file in ./src/main/java/experiment/$dirExperiment/*.java; do
  className=$(basename "$file" .java)
  mkdir -p ./src/main/java/experiment/"$dirExperiment"/"$className"
  for ((i = 1; i <= numberOfIterations; i++)) do
    timestamp=$(date +"%Y%m%d%H%M%S")
    mvn exec:java -Dexec.mainClass=experiment."$dirExperiment"."$className" > ./src/main/java/experiment/"$dirExperiment"/"$className"/"$className"-"$timestamp".log
  done
  done
  done
done
