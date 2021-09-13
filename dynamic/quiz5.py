# 병사 배치하기
# 전투력이 높은 병사가 앞쪽에 오도록 내림차순으로 배치
# 앞쪽에 있는 병사의 전투력이 뒤보다 높아야 함
# 배치 과정에서 특정 위치에 있는 병사를 열외시키는 방법을 이용
# 남아있는 병사의 수가 최대가 되도록 요구
# 즉, 남아있는 병사의 수가 최대가 되도록 하기위해 열외시켜야 하는 병사의 수
# 가장 긴 증가하는 부분 수열을 찾는 문제
# D[i] = max(D[i], D[j] + 1) if array[j] < array[i] (D[i] = array[i]를 마지막 원소로 가지는 부분수열의 최대 길이)
n = int(input()) # 병사 수
arr = list(map(int, input().split())) # 전투력

arr.reverse() 

print(arr)

dp = [1] * n
for i in range(n):
    for j in range(0, i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1) # 열외를 제외한 최대길이 갱신

print(dp)
print(n - max(dp)) # 열외 인원