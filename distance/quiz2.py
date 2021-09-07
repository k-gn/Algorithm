# 미래도시

INF = int(1e9)  # 무한

# 노드의 개수, 간선의 개수
n, m = map(int, input().split())
# 2차원 리스트 초기화
graph = [[INF] * (n + 1) for _ in range(n + 1)]

# 자기자신으로 가는 비용은 0으로 초기화
for a in range(1, n + 1):
    for b in range(1, n + 1):
        if a == b:
            graph[a][b] = 0

# 각 간선에 대한 정보를 받아 초기화
for _ in range(m):
    a,b = map(int, input().split())
    graph[a][b] = 1
    graph[b][a] = 1

# 거쳐갈 노드 k, 최종 목적지 x
x, k = map(int, input().split())

# 점화식에 따른 알고리즘 수행
for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

distance = graph[1][k] + graph[k][x]

if distance >= INF:
    print("-1")
else:
    print(distance)