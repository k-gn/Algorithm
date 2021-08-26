a = [1,2,3,4,5,6,7,8,9]
print(a)
print(a[3])
print(a[1:3])
print(a[1:-2])

b = list()
c = []

n = 10
a = [0] * n
print(a)


array = [i for i in range(10) if i % 2 == 1]
print(array)
array = [i * i for i in range(10) if i % 2 == 1]
print(array)

array = []
array.append(1)
array.append(1)
array.append(2)
array.append(3)
print(array)
array.pop(2)
print(array)
array.insert(2, 4)
print(array)
print(array.count(1))
print(len(array))
array.remove(3)
print(array)
array.sort()
array.sort(reverse=True)
array.reverse()

# n x m 크기의 2차원 리스트 초기화
n = 2
m = 3
array = [[0] * m for _ in range(n)] # _ : 무시하고자 하는 값
print(array)

a = [1,2,3,4,5,5,5]
remove_set = {3, 5}
result = [i for i in a if i not in remove_set]
print(result)