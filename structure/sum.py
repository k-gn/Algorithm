# 1부터 n 까지의 합

def sum_all(n):
    total = 0
    for i in range(1, n + 1): # O(N)
        total += i
    return total

print(sum_all(10))

def sum(n):
    return int((n * (n + 1)) / 2) # O(1)

print(sum(10))