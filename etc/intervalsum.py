# 구간 합
# 연속적으로 나열된 N개의 수가 있을 때 특정 구간의 모든 수를 합한 값을 계산
# N개의 정수로 구성된 수열이 있고
# M개의 쿼리 정보가 주어진다.
# 각 쿼리는 LEFT, RIGHT로 구성
# 각 쿼리에 대해 [LEFT, RIGHT] 구간에 포함된 데이터들의 합을 출력
# O(N + M)
# 접두사 합 : 배열의 맨 앞부터 특정 위치까지의 합을 미리 구해놓은 것
# N개의 수 위치 각각에 대해 접두사합을 게산하여 P에 저장
# 매 M개의 쿼리 정보를 확인할 때 구간합은 P[RIGHT] - P[LEFT-1]

n = 5
data = [10, 20, 30, 40, 50]

sum_value = 0
prefix_sum = [0]
# 접두사 합
for i in data:
    sum_value += i
    prefix_sum.append(sum_value)

# 구간 합
left = 3
right = 4
print(prefix_sum)
print(prefix_sum[right] - prefix_sum[left-1])

