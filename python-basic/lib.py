# 유용한 라이브러리
# 내장함수들
# itertools : 반복되는 형태의 데이터 처리에 유용한 기능들을 제공 (특히 순열과 조합 라이브러리는 자주 사용된다.)
# heapq : 힙 자료구조 제공 (일반적으로 우선순위 큐 기능 구현 시 사용된다.)
# bisect : 이진탐색 기능 제공
# collections : 덱(deque), 카운터 등의 유용한 자료구조를 포함
# math : 필수적인 수학적 기능 제공 (팩토리얼, 제곱근, 최대공약수 삼각함수, 파이 등)

# 자주 사용되는 내장함수
from typing import SupportsRound


result = sum([1,2,3,4,5])
print(result)

min_result = min(7,3,5,2)
max_result = max(7,3,5,2)
print(min_result, max_result)

result = eval("(3+5)*7")
print(result)

result = sorted([9,1,8,5,4])
reverse_result = sorted([9,1,8,5,4], reverse=True)
print(result)
print(reverse_result)

array = [('홍길동', 50), ('이순신', 32), ('아무개', 74)]
print(sorted(array, key=lambda x: x[1], reverse=True))

# 모든 경우의 수를 고려해야 할 때 어떤 라이브러리를 효과적으로 사용할 수 있을까 ?? itertools!!
# 순열 : 서로 다른 n개에서 서로 다른 r 개를 선택하여 일렬로 나열하는 것
    # - ABC 에서 세 개를 선택하여 나열하는 경우 -> ABC, ACB, BAC, BCA, CAB, CBA
    # 순열의 수 : nPr = n * (n - 1) * (n - 2) * ... * (n - r + 1)

from itertools import permutations

data = ['A', 'B', 'C']
result = list(permutations(data, 3)) # 모든 순열 구하기
print(result)
    
# 조합 : 서로 다룬 n개에서 순서에 상관 없이 서로 다른 r개를 선택하는 것
    # - ABC 에서 순서를 고려하지 않고 두 개를 뽑는 경우 -> AB, AC, BC (-> AB = BA)
    # 조합의 수 : nCr = n * (n - 1) * (n - 2) * ... * (n - r + 1) / r!
    
from itertools import combinations

data = ['A', 'B', 'C']
result = list(combinations(data, 2))
print(result)

# 중복 순열과 중복 조합
from itertools import product

result = list(product(data, repeat=2)) # 2개를 뽑는 모든 순열 구하기 (중복 허용)
print(result)

from itertools import combinations_with_replacement
result = list(combinations_with_replacement(data, 2)) # 2개를 뽑는 모든 조합 구하기 (중복 허용)
print(result)

# Counter
# 등장 횟수를 세는 기능을 제공
# 리스트와 같은 반복 가능한 객체를 내부의 원소가 몇 번씩 등장했는지 알려준다.
from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])
print(counter['blue'])
print(counter['green'])
print(dict(counter)) # 사전 자료형으로 반환 (요소명, 갯수)

# 최대 공약수(gcd), 최소 공배수(lcm)
import math
def lcm(a, b): 
    return a * b // math.gcd(a, b) 

a = 21
b = 14
print(math.gcd(a, b))
print(lcm(a, b))

