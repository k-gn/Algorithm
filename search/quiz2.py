# 정렬된 배열에서 특정 수의 개수 구하기
# n개의 원소 배열에서 특정 수 m이 등장하는 횟수

from bisect import bisect_left, bisect_right

n, m = map(int, input().split())
array = list(map(int, input().split()))

result = bisect_right(array, m) - bisect_left(array, m)
print(result)