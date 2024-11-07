#!/bin/bash

# Number of times to execute the Java file
num_executions=10

# Get Java files in the practical directory
java_files=$(find ./src/main/java/experiment/practical -name "*.java")

# Compile the Java files
for file in $java_files; do
  mvn compile
done

datetime=$(date +%Y%m%d%H%M%S)
parent_dir="practical_experiment_log/reproduce_practical_experiment_logs_${datetime}"
mkdir -p "${parent_dir}"

# Execute the Java files the specified number of times
for file in $java_files; do
  filename=$(basename -- "$file")
  filename="${filename%.*}"
  datetime=$(date +%Y%m%d%H%M%S)
  dir_name="${filename}_${datetime}"
  mkdir -p "${parent_dir}/${dir_name}"
  for ((i=1; i<=num_executions; i++)); do
    # Get the current date and time
    datetime=$(date +%Y%m%d%H%M%S)

    # Create the log file names
    log_file="${parent_dir}/${dir_name}/${filename}_${datetime}.log"

    # Execute the Java file and save the result to the log file
    mvn exec:java -Dexec.mainClass="experiment.practical.${filename}" > $log_file
  done
done
