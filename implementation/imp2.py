# 시각 문제
# 모든 시각 중 3이 하나라도 포함 되는 모든 경우의 수

h = int(input()) # H 시

count = 0

for i in range(h + 1): # 시
    for j in range(60): # 분
        for k in range(60): # 초
            if '3' in str(i) + str(j) + str(k):
                count += 1
                
print(count)