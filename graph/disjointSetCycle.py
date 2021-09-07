# 서로소 집합은 무방향 그래프 내에서의 사이클 판별에 사용할 수 있다.
# 참고로 방향 그래프에서 사이클 여부는 DFS를 이용해 판별 가능
# 사이클 판별
# 1. 각 간선을 하나씩 확인해 두 노드의 루트 노드 확인
#       루트 노드가 서로 다르면, 두 노드의 대해 합칩합 수행
#       루트 노드가 같으면 사이클 발생
# 2. 모든 간선에 대해 1번 반복

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
for i in range(1, v + 1):
    parent[i] = i

cycle = False

for i in range(e):
    a, b = map(int, input().split())
    if find_parent(parent, a) == find_parent(parent, b):
        cycle = True
        break
    else:
        union_parent(parent, a, b)

if cycle:
    print("사이클이 발생했습니다")
