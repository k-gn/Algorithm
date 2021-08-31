# 퀵 정렬
# 기준데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾼다.
# 기본적인 퀵정렬은 첫번째 데이터를 기준데이터 (pivot) 로 설정
# 왼쪽에서 부턴 피벗보다 큰 데이터, 오른쪽에서 부턴 작은 데이터를 고른 후 교환
# 데이터가 왼쪽 오른쪽이 만날 경우 작은 데이터와 피벗값을 바꿔준다.
# 이렇게 되면 왼쪽과 오른쪽으로 분할된다.
# 이 후 다시 퀵정렬을 왼쪽과 오른쪽에서 재귀적으로 수행한다.
array = [7,5,9,0,3,1,4,2,8,6]

# O(NlogN)

def quick_sort_advanced(array):
    if len(array) <= 1:
        return array
    
    pivot = array[0]
    tail = array[1:] # 피벗을 제외한 리스트
    
    left_side = [x for x in tail if x <= pivot]
    right_side = [x for x in tail if x > pivot]
    
    return quick_sort(left_side) + [pivot] + quick_sort(right_side)

def quick_sort(array, start, end):
    if start >= end: # 원소가 1개인 경우 종료
        return
    
    pivot = start
    left = start + 1
    right = end
    
    while(left <= right):
        # 피벗보다 큰 데이터
        while(left <= end and array[left] <= array[pivot]):
            left += 1
        # 피벗보다 작은 데이터
        while(right > start and array[right] >= array[pivot]):
            right -= 1

        if left > right: # 엇갈릴 경우
            array[right], array[pivot] = array[pivot], array[right]
        else: # 엇갈리지 않을 경우
            array[right], array[left] = array[left], array[right]
    
    # 분할 후 왼쪽 부분과 오른쪽 부분 각각 재귀 수행
    quick_sort(array, start, right - 1)
    quick_sort(array, right + 1, end)

quick_sort(array, 0, len(array) - 1)
print(array) 