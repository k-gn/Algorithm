# 다수의 소수 판별 -> 에라토스테네스의 체 알고리즘 사용
# 특정한 수의 범위 안에 존재하는 모든 소수를 찾는 방법
# N보다 작거나 같은 모든 소수를 찾을 때 사용
# 1. 2부터 N 까지의 모든 자연수를 나열
# 2. 남은 수 중에서 아직 처리하지 않은 가장 작은 소수 i를 찾는다.
# 3. 남은 수 중에서 i의 배수를 모두 제거 (i는 제거하지 않는다.)
# 4. 2번과 3번 반복
# O(NloglogN)
# 메모리가 많이 필요하다.

import math
n = 1000

# 처음엔 모든 수가 소수(True)인 것으로 초기화
array = [True for i in range(n + 1)]

# 2부터 n의 제곱근까지의 모든 수를 확인
for i in range(2, int(math.sqrt(n)) + 1):
    if array[i] == True: # 소수인 경우
        # i를 제외한 i의 모든 배수를 지우기
        j = 2
        while i * j <= n:
            array[i * j] = False # 배수를 거르는 작업
            j += 1 # 배수 증가

for i in range(2, n + 1):
    if array[i]:
        print(i, end=" ")