#!/bin/bash

# ログファイルが存在するディレクトリを指定
log_dir="practical_experiment_log/practical_experiment_logs_20240917075343/GearShift_20240917075343"

# 最大フィールド数を格納する配列
max_fields=()

# ディレクトリ内のすべてのログファイルに対して処理を実行
for log_file in "$log_dir"/*.log; do
    if [ -f "$log_file" ]; then
        max_field=$(awk -F , 'c{print NF; c = 0} /counterex/ {c = 1}' < "$log_file" | sort -n | tail -1)
        if [ -n "$max_field" ]; then
            max_fields+=("$max_field")
        fi
    fi
done

# 最大フィールド数の合計を計算
sum=0
for value in "${max_fields[@]}"; do
    sum=$((sum + value))
done

# 平均を計算
if [ ${#max_fields[@]} -gt 0 ]; then
    average=$(echo "$sum / ${#max_fields[@]}" | bc -l)
    ret=$(echo "scale=2; $average / 2" | bc -l)
    echo "ATGS: average maximum length of cex: $ret"
    # 特定のファイルに $ret の値を書き込む
    output_file="practical_experiment_log/practical_experiment_logs_20240917075343/GearShift_20240917075343/AverageGearShift_20240917075343.txt"
    echo "Average cex: $ret" >> "$output_file"
else
    echo "Not found log files."
fi

# ログファイルが存在するディレクトリを指定
log_dir="practical_experiment_log/practical_experiment_logs_20240917075343/MarsHelicopter_20240917144739"

# 最大フィールド数を格納する配列
max_fields=()

# ディレクトリ内のすべてのログファイルに対して処理を実行
for log_file in "$log_dir"/*.log; do
    if [ -f "$log_file" ]; then
        max_field=$(awk -F , 'c{print NF; c = 0} /counterex/ {c = 1}' < "$log_file" | sort -n | tail -1)
        if [ -n "$max_field" ]; then
            max_fields+=("$max_field")
        fi
    fi
done

# 最大フィールド数の合計を計算
sum=0
for value in "${max_fields[@]}"; do
    sum=$((sum + value))
done

# 平均を計算
if [ ${#max_fields[@]} -gt 0 ]; then
    average=$(echo "$sum / ${#max_fields[@]}" | bc -l)
    ret=$(echo "scale=2; $average / 4" | bc -l)
    output_file="practical_experiment_log/practical_experiment_logs_20240917075343/MarsHelicopter_20240917144739/AverageMarsHelicopter_20240917144739.txt"
    echo "Average cex: $ret" >> "$output_file"
else
    echo "Not found log files."
fi
