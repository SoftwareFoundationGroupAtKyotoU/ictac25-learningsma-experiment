all: mean_time_n_10.tsv mean_time_sigmae_10.tsv output_queries_sigmae_10.tsv output_queries_n_10.tsv

output_queries_sigmae_10.tsv: aggregated.json
	jq -r '.[] | select(.SigmaE_param == 10) | [.n,.output.mean] | @tsv' $< | sort -n > $@
output_queries_n_10.tsv: aggregated.json
	jq -r '.[] | select(.n == 10) | [.SigmaE_param,.output.mean] | @tsv' $< | sort -n > $@ 
mean_time_sigmae_10.tsv: aggregated.json
	jq -r '.[] | select(.SigmaE_param == 10) | [.n,.run_time.mean] | @tsv' $< | sort -n > $@
mean_time_n_10.tsv: aggregated.json
	jq -r '.[] | select(.n == 10) | [.SigmaE_param,.run_time.mean] | @tsv' $< | sort -n > $@ 
