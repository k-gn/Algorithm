# 금광


for tc in range(int(input())):
    n, m = map(int, input().split()) # n 행 m 열
    array = list(map(int, input().split())) 
    
    dp = []
    index = 0
    
    for i in range(n):
        dp.append(array[index:index+m]) # 열 단위로 슬라이싱
        index += m
    # print(dp)
    
    # 1 3 2 5
    # 6 2 1 4
    # 2 5 6 1

    for j in range(1, m): # 열
        for i in range(n): # 행
            # print("i : " , i)
            # 왼쪽 위에서 오는 경우
            if i == 0: left_up = 0 # 인덱스를 벗어날 경우
            else: left_up = dp[i - 1][j - 1]
            # 왼쪽 아래에서 오는 경우
            if i == n - 1: left_down = 0 # 인덱스를 벗어날 경우
            else: left_down = dp[i + 1][j - 1]
            # 왼쪽에서 오는 경우
            left = dp[i][j - 1]
            print(left, left_up, left_down)
            dp[i][j] = dp[i][j] + max(left_up, left_down, left);
            print(dp)
        

result = 0
for i in range(n):
    result = max(result, dp[i][m - 1])

print(result)