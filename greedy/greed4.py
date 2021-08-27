# 모험가 길드 공포도
# 공포도가 낮은 모험가부터 확인 (오름차순 정렬)
# 공포도가 n 인 모험가는 n 명 이상의 그룹이여야 함

n = int(input())
data = list(map(int, input().split()))
data.sort()

result = 0 # 총 그룹 수
count = 0 # 그룹에 포함된 모험가 수

for i in data:
    count += 1
    if count >= i:
        result += 1
        count = 0
        
print(result)