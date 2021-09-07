# 개선된 다익스트라
# - 힙 자료구조를 이용
# 기본 원리는 동일하다.
# 현재 가장 가까운 노드를 저장하기 위해 힙 자료구조를 이용
# 현재 최단 거리가 가장 짧은 노드를 선택해야 하므로 최소 힙 사용
# ElogV

import heapq

INF = int(1e9)  # 무한

# 노드의 개수, 간선의 개수
n, m = map(int, input().split())
# 시작 노드 번호
start = int(input())
# 각 노드에 연결되어 있는 노드에 대한 정보
graph = [[] for i in range(n + 1)]
# 최단 거리 테이블
distance = [INF] * (n + 1)

# 간선의 정보 입력 받기
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))  # a -> b 의 비용이 c
    

def dijkstra(start):
    q = []
    # 시작 노드로 가기위한 최단 경로는 0으로 설정
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        # 가장 최단 거리가 짧은 노드 꺼내기
        dist, now = heapq.heappop(q);
        # 현재 노드가 이미 처리된 적 있는 노드면 무시 (방문 처리와 동일)
        if distance[now] < dist:
            continue
        # 현재 노드와 연결된 다른 인접 노드 확인
        for i in graph[now]:
            cost = dist + i[1]
            # 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우 갱신
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0])) # 우선순위 큐에 인접 노드 저장


dijkstra(start)

# 모든 노드로 가기 위한 최단 거리 출력
for i in range(1, n + 1):
    if distance[i] == INF: # 도달할 수 없는 경우
        print("INF")
    else:
        print(distance[i])