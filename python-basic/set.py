# 집합
# 중복허용 x, 순서가 없음
# set(), {}
# 데이터 조회, 수정에 있어서 O(1) 의 시간에 처리가능

data = set([1,2,3,4,5,5,5])
print(data)

data = {1,1,2,3,4,4,5}
print(data)

a = set([1,2,3,4,5])
b = set([3,4,5,6,7])

# 합집합
print(a | b)
# 교집합
print(a & b)
# 차집합
print(a - b)

data.add(6)
print(data)
data.update([7,8])
print(data)
data.remove(3)
print(data)

# 사전과 집합은 순서가 없어서 인덱스로 접근이 불가하고 키 또는 특정 원소를 이용해 조회