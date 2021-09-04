# 병사 배치하기
# 가장 긴 증가하는 부분 수열을 찾는 문제

n = int(input())
arr = list(map(int, input().split()))

arr.reverse()

print(arr)

dp = [1] * n
for i in range(1, n):
    for j in range(0, i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

print(dp)
print(n - max(dp)) # 열외 인원