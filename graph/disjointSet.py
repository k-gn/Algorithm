# 서로소 집합
# 공통 원소가 없는 두 집합 ( {1,2} {3,4} )
# 서로소 부분집합들로 나누어진 원소들의 데이터를 처리하기 위한 자료구조
# 서로소 집합 자료구조가 지원하는 두 종류의 연산
#  - 합집합(Union) : 두 개의 원소가 포함된 집합을 하나의 집합으로 합치는 연산
#  - 찾기(Find) : 특정한 원소가 속한 집합이 어떤 집합인지 알려주는 연산
# 합치기 찾기 자료구조라고 불리기도 한다.

# 1. 합집합 연산을 하여 서로 연결된 두 노드 A,B를 확인
#       A와 B의 루트 노드 A',B'를 각각 찾는다.
#       A'를 B'의 부모 노드로 설정
# 2. 모든 합집합 연산을 처리할 때까지 1번 반복

# 특정 원소가 속한 집합을 찾기
def find_parent(parent, x):
    # 루트 노드를 찾을 때까지 재귀 호출 (자기자신이 루트일때까지)
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
print(parent)
for i in range(e):
    a, b = map(int, input().split())
    union_parent(parent, a, b)

for i in range(1, v + 1):
    print(find_parent(parent, i))

for i in range(1, v + 1):
    print(parent[i], end=" ")