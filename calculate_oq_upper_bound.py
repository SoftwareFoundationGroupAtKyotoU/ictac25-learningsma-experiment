def calculate_oq_upper_bound(SigmaEf, m, n):
    result = (
        (SigmaEf + m + 1) * n**2 + (2 * m + SigmaEf + 1) * SigmaEf * n + m * SigmaEf**2
    )
    return result


# MH
SigmaEf = 36
m = 4
n = 5
print(calculate_oq_upper_bound(SigmaEf, m, n))
# ATGS
SigmaEf = 66
m = 12
n = 16
print(calculate_oq_upper_bound(SigmaEf, m, n))
