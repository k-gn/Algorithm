# 폴로이드 워셜 알고르짐
# 모든 노드에서 다른 모든 노드까지의 최단 경로를 모두 계산
# 거쳐가는 노드를 기준으로 수행
# 2차원 테이블에 최단 거리 정보를 저장
# 매 단계마다 방문하지 않은 노드 중 최단거리를 갖는 노드를 찾는 과정이 필요하지 않음
# 각 단계마다 특정한 노드 k를 거쳐가는 경우를 확인
# a 에서 b로 가는 최단거리보다 a 에서 k를 거쳐 b로가는 거리가 더 짧은지 검사
# O(N3)
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
    a,b,c = map(int, input().split())
    graph[a][b] = c

# 점화식에 따른 알고리즘 수행
for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

for a in range(1, n + 1):
    for b in range(1, n + 1):
        if graph[a][b] == INF:
            print("INF", end=" ")
        else:
            print(graph[a][b], end=" ")
    print()