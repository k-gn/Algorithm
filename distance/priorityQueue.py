# 우선순위 큐
# 우선 순위가 가장 높은 데이터를 가장 먼저 삭제하는 자료구조
# 힙으로 구현가능, 최소 힙(default)과 최대 힙이 있다.
# 간선의 개수는 노드 갯수 - 1

import heapq

# 오름차순 힙 정렬
def heapsort(iterable):
    h = []
    result = []

    for value in iterable:
        heapq.heappush(h, value)
    print(h)
    for i in range(len(h)):
        num = heapq.heappop(h);
        print(num)
        result.append(num)
    return result

# 내림차순 힙 정렬
def heapsort2(iterable):
    h = []
    result = []

    for value in iterable:
        heapq.heappush(h, -value)
    for i in range(len(h)):
        num = -heapq.heappop(h);
        print(num)
        result.append(num)
    return result

result1 = heapsort([1,3,5,7,2,4,6,8,0])
result2 = heapsort2([1,3,5,7,2,4,6,8,0])
print(result1)
print(result2)