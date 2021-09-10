# 음료수 얼려먹기
# 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수
# 구멍이 뚫려있는 부분은 0, 칸막이 부분은 1
# 구멍이 있는 부분끼리 상하좌우로 붙어 있으면 서로 연결된 하나로 간주
# DFS 사용

n, m = map(int, input().split())

graph = []

for i in range(n):
    graph.append(list(map(int, input())))
    
print(graph)
    
def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False;
    
    if graph[x][y] == 0:
        graph[x][y] = 1 # 방문 처리
        # 연결된 상하좌우 위치들을 차례대로 재귀호출하여 확인 (연결된 노드 방문처리 수행 목적)
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False
        
    
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1
            
print(result)