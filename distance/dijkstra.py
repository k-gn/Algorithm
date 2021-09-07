# 다익스트라 최단경로 알고리즘
# 특정한 노드에서 출발해 다른 모든 노드로 가는 최단 경로를 계산
# 음의 간선이 없을 때 정상적
# 그리디 알고리즘으로 분류된다. (매 상황에서 가장 비용이 적은 노드 선택)
# 다이나믹 프로그래밍 원리도 적용될 수 있다.

# 출발 노드 설정 -> 최단 거리 테이블 초기화 -> 방문하지 않은 노드 중 최단 거리가 가장 짧은 노드 선택
# -> 해당 노드를 거쳐 다른 노드로 가는 비용을 계산하여 테이블 갱신
# 한번 처리된 노드의 최단거리는 고정 (한 단계당 하나의 노드에 대한 최단 거리를 확실히 찾는 것)
# 테이블에 각 노드까지의 최단 거리 정보가 저장된다.


INF = int(1e9)  # 무한

# 노드의 개수, 간선의 개수
n, m = map(int, input().split())
# 시작 노드 번호
start = int(input())
# 각 노드에 연결되어 있는 노드에 대한 정보
graph = [[] for i in range(n + 1)]
# 방문 체크
visited = [False] * (n + 1)
# 최단 거리 테이블
distance = [INF] * (n + 1)

# 간선의 정보 입력 받기
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))  # a -> b 의 비용이 c


# 방문하지 않은 노드 중, 최단 거리가 가장 짧은 노드의 번호 반환
def get_smallest_node():
    min_value = INF
    index = 0
    for i in range(1, n + 1):
        if distance[i] < min_value and not visited[i]:
            min_value = distance[i]
            index = i
    return index


def dijkstra(start):
    # 시작 노드 초기화
    distance[start] = 0
    visited[start] = True
    # 시작 노드와 연결된 노드간의 거리 갱신
    for j in graph[start]:
        distance[j[0]] = j[1]

    for i in range(n-1):
        # 현재 최단 거리가 가장 짧은 노드 선택
        now = get_smallest_node()
        visited[now] = True
        # 현재 노드와 연결된 다른 노드들 확인
        for j in graph[now]:
            cost = distance[now] + j[1]
            # 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우 갱신
            if cost < distance[j[0]]:
                distance[j[0]] = cost

dijkstra(start)

# 모든 노드로 가기 위한 최단 거리 출력
for i in range(1, n + 1):
    if distance[i] == INF: # 도달할 수 없는 경우
        print("INF")
    else:
        print(distance[i])

