# 효율적인 화폐구성
# n 가지 종류의 화폐
# 개수를 최소한으로 이용해서 가치의 합이 m원이 되도록 한다.
# 즉, m원을 만들기 위한 최소한의 화폐 개수
# ai = min(ai, ai-k + 1) (ai = 금액 i를 만들 수 있는 최소한의 화폐 개수, k = 각 화폐의 단위)
n, m = map(int, input().split())

array = []
for i in range(n):
    array.append(int(input()))
    
d = [10001] * (m + 1)
d[0] = 0

for i in range(n): # 각 화폐 수
    for j in range(array[i], m + 1): # 각 금액
        if d[j - array[i]] != 10001: # i - k 를 만들 수 있는 경우 i 도 만들 수 있다. (2를 만들 수 있으면 4도 가능)
            d[j] = min(d[j], d[j - array[i]] + 1)
            
if d[m] == 10001: # m원을 만드는 방법이 없는 경우
    print(-1)
else:
    print(d[m])