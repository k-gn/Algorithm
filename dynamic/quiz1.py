# 개미전사 창고 공격
# 최소한 한 칸 이상 떨어진 식량창고 약탈
# 얻을 수 있는 식량의 최대값
# ai = max(ai-1, ai-2 + ki) (ai = 1번째 식량창고까지의 최적의 해, ki = i번째 식량창고에 있는 식량의 양)

n = int(input()) # 창고 개수
array = list(map(int, input().split()))

d = [0] * 100 # 최대 식량값을 저장할 dp

d[0] = array[0]
d[1] = max(array[0], array[1])

for i in range(2, n):
    d[i] = max(d[i - 1], d[i - 2] + array[i])
    
print(d[n - 1])