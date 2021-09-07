# 신장 트리 : 그래프에서 모든 노드를 포함하면서, 사이클이 존재하지 않는 부분 그래프
# 최소 신장 트리 : 최소한의 비용으로 구성되는 신장트리
# 대표 알고리즘 : 크루스칼 알고리즘
# 그리디 알고리즘으로 분류된다.
# 1. 간선 데이터를 비용에 따라 오름차순으로 정렬
# 2. 간선을 하나씩 확인하며, 현재의 간선이 사이클을 발생시키는지 확인
#       사이클이 발생하지 않는 경우 최소 신장 트리에 포함
#       사이클이 발생하는 경우 최소 신장 트리에 포함 X
# 3. 모든 간선에 대해 2번 반복
# 최소 신장 트리에서 간선에 갯수는 전체 노드 갯수 - 1
# O(ElogE) (E : 간선의 개수)

# 특정 원소가 속한 집합을 찾기
def find_parent(parent, x):
    # 루트 노드를 찾을 때까지 재귀 호출
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]

# 두 원소가 속한 집합을 합치기
def union_parent(parent, a, b):
    # 각각 루트노드를 찾아 비교 후 갱신
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

# 노드의 개수와 간선
v, e = map(int, input().split())
# 부모 테이블 초기화
parent = [0] * (v + 1)

# 간선 리스트와, 최종 비용 변수
edges = []
result = 0

for i in range(1, v + 1):
    parent[i] = i

# 간선 정보 입력 받기
for _ in range(e):
    a, b, cost = map(int, input().split()) # 비용이 cost 인 a -> b 간선 
    edges.append((cost, a, b)) # 비용 순으로 정렬하기 위해 첫번째 원소를 비용으로 설정

edges.sort()

# 간선을 하나씩 확인
for edge in edges:
    cost, a, b = edge
    # 사이클 여부 확인 후 포함
    if find_parent(parent, a) != find_parent(parent, b):
        union_parent(parent, a, b) # 집합에 포함
        result += cost # 최종 코스트 구하기

print(result)
    