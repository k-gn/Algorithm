# 떡볶이 떡 만들기
# 최대 떡 조건을 충족할 길이 구하기

n, m = map(int, input().split())

array = list(map(int, input().split()))

start = 0
end = max(array)

result = 0

while(start <= end):
    total = 0
    mid = (start + end) // 2
    for x in array:
        if x > mid:
            total += x
    
    if total < m:
        end = mid - 1
    else:
        start = mid + 1
        result = mid
print(result)
