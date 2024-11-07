#!/bin/bash

# Specify the number of states
numberOfStates=80
# Specify the number of Sigma_E
numberOfSigmaE=20
# Specify the number of generations
numberOfGenerations=5
# Specify the number of iterations
numberOfIterations=1

mvn compile

# Get the current timestamp
timestamp=$(date +"%Y%m%d%H%M%S")
dirExperiment="Random${numberOfStates}States${numberOfSigmaE}SigmaE$timestamp"
# Make the directory
mkdir -p ./src/main/java/experiment/"$dirExperiment"

# Generate the random automata
for ((i = 1; i <= numberOfGenerations; i++))
do
  timestamp=$(date +"%Y%m%d%H%M%S")
  dirFile=Random${numberOfStates}States${numberOfSigmaE}SigmaE$timestamp
  mvn exec:java -Dexec.mainClass=experiment.RandomGenerator -Dexec.args="$numberOfStates $numberOfSigmaE $dirExperiment $dirFile"

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
