# 미래도시
# 1번부터 N번까지이 회사가 있다.
# 방문 판매원 A는 현재 1번회사에 있고, X번 회사에 방문해 물건을 판매해야한다.
# 양방향 이동 가능
# 특정 회사와 다른 회사의 도로가 연결되있다면, 1만큼의 시간으로 이동할 수 있다.
# A가 1번 회사에서 출발해 K번 회사를 방문하고, X번 회사로 가는것이 목표
# 가능한 최소 시간은?
# 이때 N의 크기는 100 이하 (100 이하일 경우 플로이드 알고리즘을 쓰면 효율적이다.)

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
print(graph)
if distance >= INF:
    print("-1")
else:
    print(distance)