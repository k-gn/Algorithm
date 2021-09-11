# 떡볶이 떡 만들기
# 최대 떡 조건을 충족할 길이 구하기
# 최소 m 만큼의 떡을 얻기 위해 절단기에 설정할 수 있는 높이의 최대값

n, m = map(int, input().split())

# 떡들의 높이를 입력
array = list(map(int, input().split()))

start = 0
end = max(array) # 떡의 최대 높이

result = 0

while(start <= end):
    total = 0
    mid = (start + end) // 2
    for x in array:
        if x > mid:
            total += x - mid # 잘린 떡들의 길이 합 계산
    
    if total < m: # 요구한 길이와 비교
        end = mid - 1
    else:
        start = mid + 1
        result = mid
print(result)
