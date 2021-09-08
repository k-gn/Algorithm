# 벨만포드 최단경로 알고리즘
# 음수 간선에 관한 최단경로
# 음수 간선이 있는 경우 음수 간선 순환 유무로 또 나뉜다.
# 다익스트라에 비해서 느리다.
# 1. 출발 노드 설정
# 2. 최단 거리 테이블 초기화
# 3. 전체 간선 E개를 하나씩 확인
# 4. 각 간선을 거쳐 다른 노드로 가는 비용을 계산하여 최단 거리 테이블 갱신
# 만약 음의 간선 순환이 발생하는지 체크하고 싶다면 3,4번 과정을 한번 더 수행
# 이때 최단 거리 테이블이 갱신되면 음수 간선 순환이 존재

INF = int(1e9)  # 무한
# 노드의 개수, 간선의 개수
n, m = map(int, input().split())
edges = []
dist = [INF] * (n + 1)

for _ in range(m):
    a, b, c = map(int, input().split())
    edges.append((a, b, c)) # a 에서 b 로 가는 비용이 c인 간선

def bf(start):
    # 시작 노드 초기화
    dist[start] = 0
    # 전체 n번 라운드 반복
    for i in range(n):
        # 매 반복마다 모든 간선 확인
        for j in range(m):
            cur = edges[j][0]
            next_node = edges[j][1]
            cost = edges[j][2]
            # 현재 간선을 거쳐 다른 노드로 이동하는 거리가 더 짧은 경우 갱신
            if dist[cur] != INF and dist[next_node] > dist[cur] + cost:
                dist[next_node] = dist[cur] + cost
                # 마지막 n번째 라운드에서도 값이 갱신된다면 음수 순환이 존재
                if i == n - 1:
                    return True
    return False

