# 효율적인 화폐구성

n, m = map(int, input().split())

array = []
for i in range(n):
    array.append(int(input()))
    
d = [10001] * (m + 1)
d[0] = 0

for i in range(n): # 각 화폐 수
    for j in range(array[i], m + 1): # 각 금액
        if d[j - array[i]] != 10001: # i - k 를 만들 수 있는 경우 i 도 만들 수 있다.
            d[j] = min(d[j], d[j - array[i]] + 1)
            
if d[m] == 10001:
    print(-1)
else:
    print(d[m ])