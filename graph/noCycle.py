# 위상 정렬
# 사이클이 없는 방향 그래프의 모든 노드를 방향성에 거스르지 않도록 순서대로 나열
# 진입 차수 (Indegree) : 특정한 노드로 들어오는 간선의 개수
# 진출 차수 (Outdegree) : 특정한 노드에서 나가는 간선의 개수
# DFS 또는 큐를 이용해 정렬 가능
# 큐
# 1. 진입 차수가 0인 모든 노드를 큐에 넣는다.
# 2. 큐가 빌 때 까지 다음 과정 반복
#       큐에서 원소를 꺼내 해당 노드에서 나가는 간선을 그래프에서 제거
#       새롭게 진입차수가 0이 된 노드를 큐에 넣는다.
# => 결과적으로 각 노드가 큐에 들어온 순서가 위상 정렬과 같다.
# 여러가지 답이 존재할 수 있다.
# 모든 원소를 방문하기 전에 큐가 빈다면 사이클이 존재한다고 판단가능
# O(V + E)

from collections import deque

# 노드, 간선
v, e = map(int, input().split())
# 진입 차수 초기화
indegree = [0] * (v + 1)
# 연결 리스트
graph = [[] for i in range(v + 1)]

for _ in range(e):
    a, b = map(int, input().split())
    graph[a].append(b)
    indegree[b] += 1

# 위상 정렬
def topology_sort():
    result = [] # 알고리즘 수행 결과 리스트
    q = deque() # 큐

    # 처음 시작 시 진입 차수가 0인 노드를 큐에 삽입
    for i in range(1, v + 1):
        if indegree[i] == 0:
            q.append(i)
    # 큐가 빌 때까지 반복
    while q:
        now = q.popleft()
        result.append(now)
        # 연결돈 노드들의 진입차수 1 빼기
        for i in graph[now]:
            indegree[i] -= 1
            # 새롭게 진입차수가 0이 되는 노드를 큐에 삽입
            if indegree[i] == 0:
                q.append(i)

    for i in result:
        print(i, end=" ")

topology_sort()



