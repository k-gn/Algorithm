# 이진 탐색 : 정렬된 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색
#   - 시작점, 끝점, 중간점을 이용하여 탐색 범위를 설정한다.
# 순차 탐색 : 리스트에서 특정 데이터를 찾기 위해 앞에서부터 데이터를 하나씩 확인하는 탐색

def binary_search(array, target, start, end):
    if start > end:
        return None
    
    mid = (start + end) // 2 # 중간점
    
    if array[mid] == target: # 찾을 경우 인덱스 리턴
        return mid 
    elif array[mid] > target:
        return binary_search(array, target, start, mid - 1) # 왼쪽 탐색
    else:
        return binary_search(array, target, mid + 1, end) # 오른쪽 탐색
    
def binary_search_loop(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if array[mid] == target: 
            return mid 
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None

# n, target = map(int, input().split())

# array = list(map(int, input().split()))

# result = binary_search(array, target, 0, n - 1)

# if result == None:
#     print('원소가 존재하지 않습니다.')
# else:
#     print(result + 1)
        
# 이진 탐색 라이브러리

from bisect import bisect_left, bisect_right

a = [1,2,4,4,8]
x = 4

print(bisect_left(a, x)) # 배열 a에 x를 삽입할 가장 왼쪽 인덱스 반환
print(bisect_right(a, x)) # 배열 a에 x를 삽입할 가장 오른쪽 인덱스 반환

# 값이 특정 범위에 속하는 데이터 개수 구하기

def count_by_range(a, left, right):
    right_idx = bisect_right(a, right)
    left_idx = bisect_left(a, left)
    print(right_idx, left_idx)
    return right_idx - left_idx

a = [1,2,3,3,3,3,4,4,5,6]
print(count_by_range(a, 4, 4)) # 값이 4인 데이터 개수 출력
print(count_by_range(a, -1, 3)) # 값이 [-1, 3] 범위에 있는 데이터 출력

# 파라메트릭 서치
# 최적화 문제를 결정 문제로 바꿔 해결하는 기법
# ex) 특정한 조건을 만족하는 가장 알맞은 값을 빠르게 찾는 최적화 문제 -> 이진 탐색으로 해결 가능