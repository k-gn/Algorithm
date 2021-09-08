# 최소 공통 조상
# 1. 모든 노드에 대한 깊이 계산 (DFS)
# 2. 최소 공통 조상을 찾을 두 노드 확인
#       먼저 두 노드의 깊이가 동일하도록 거슬러 올라간다.
#       이 후 부모가 같아질때까지 반복적으로 부모방향으로 거슬러 올라간다.
# 3. 모든 LCA연산에 대해 2번의 과정 반복

n = int(input())

parent = [0] * (n + 1) # 부모 노드 정보
d = [0] * (n + 1) # 각 노드까지의 깊이
c = [0] * (n + 1) # 각 노드의 깊이 계산 여부
graph = [[] for _ in range(n + 1)]

for _ in range(n - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# 루트 노드부터 시작해 깊이를 구하는 함수
def dfs(x, depth):
    c[x] = True
    d[x] = depth
    for y in graph[x]:
        if c[y]: # 이미 깊이를 구했다면 넘기기
            continue
        parent[y] = x
        dfs(y, depth + 1)

def lca(a, b):
    while d[a] != d[b]:
        if d[a] > d[b]:
            a = parent[a]
        else:
            b = parent[b]

    while a != b:
        a = parent[a]
        b = parent[b]
    return a

dfs(1, 0)

