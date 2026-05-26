#!/bin/sh

export MAVEN_OPTS="${MAVEN_OPTS:+$MAVEN_OPTS }-Xmx64g"

# Generate Random s-MA models for the learning benchmark
# Produces .java files only (no learning runs)

# Specify the number of states
#numberOfStates='10 20 40 80 120'
numberOfStates='120'
# Specify the number of Sigma_E
numberOfSigmaE='10 20 30 40'
# Specify the number of generations per combination
numberOfGenerations=10

mvn compile

# Generate the random automata
for states in $numberOfStates; do
  for sigmaE in $numberOfSigmaE; do
    dirExperiment="Random${states}States${sigmaE}SigmaE$(date +"%Y%m%d%H%M%S")"
    for generation in $(seq $numberOfGenerations); do
      # Make the directory
      mkdir -p ./src/main/java/experiment/"$dirExperiment"
      dirFile=Random${states}States${sigmaE}SigmaE$(date +"%Y%m%d%H%M%S")
      mvn exec:java -Dexec.mainClass=experiment.RandomGenerator -Dexec.args="$states $sigmaE $dirExperiment $dirFile"
    done
  done
done
