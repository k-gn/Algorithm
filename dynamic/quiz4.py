# 금광
# n x m 크기의 금광
# 금광은 1 x 1 크기의 칸으로 나누어져 있다.
# 첫번째 열부터 출발하여 금을 캔다.
# 첫번째 열의 어느 행에서든 출발 후, m - 1번에 걸쳐서 매번 오른쪽 위, 오른쪽, 오른쪽 아래 3가지 중 하나의 위치로 이동해야 한다.
# 채굴자가 얻을 수 있는 금의 최대 크기 출력
# dp[i][j] = array[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])
# dp[i][j] = i행 j열까지의 최적의 해(얻을 수 있는 금의 최대값), array[i][j] = i행 j열에 존재하는 금의양

for tc in range(int(input())): # test case
    # 금광 정보 입력
    n, m = map(int, input().split()) # n 행 m 열
    array = list(map(int, input().split())) 
    
    dp = []
    index = 0
    # 2차원 dp 테이블 초기화
    for i in range(n):
        dp.append(array[index:index+m]) # 열 단위로 슬라이싱
        index += m
    print(dp)
    
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