# 구현 : 머릿속에 있는 알고리즘을 코드로 바꾸는 과정

# 상하좌우 문제
# (1,1) 시작
# L R U D 계획서

n = int(input())
x, y = 1, 1

plans = input().split()

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

for plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = y + dy[i]
        
        # 공간을 벗어나는 경우 무시
        if nx < 1 or ny < 1 or nx > n or ny > n:
            continue
        
    x, y = nx, ny

print(x, y)