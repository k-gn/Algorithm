# 투 포인터 알고리즘
# 리스트에 순차적으로 접근해야 할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘
# ex) 흔히 2,3,4,5,6,7 번 학생을 지목할 때 간단히 '2번부터 7번까지의 학생' 이라고 부른다.
# 시작점과 끝점 2개의 점으로 접근할 데이터의 범위를 표현

# 특정한 합을 가지는 부분 연속 수열 찾기
# N개의 자연수로 구성된 수열에서 합이 M인 부분 연속 수열의 개수
# O(N)
# 1. 시작점과 끝점이 첫번째 원소의 인덱스를 가리키도록 한다.
# 2. 현재 부분합이 M과 같다면 카운트한다.
# 3. 현재 부분합이 M보다 작다면, 끝점을 1 증가
# 4. 현재 부분합이 M이상이면, 시작점을 1 증가
# 5. 2번부터 4번까지 과정 반복

n = 5 # 데이터 갯수
m = 5 # 부분합
data = [1,2,3,2,5] # 전체 수열

count = 0
interval_sum = 0
end = 0

for start in range(n):
    while interval_sum < m and end < n:
        interval_sum += data[end]
        end += 1

    if interval_sum == m:
        count += 1

    interval_sum -= data[start]

print(count)