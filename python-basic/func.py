def add(a, b):
    return a + b
# print(add(3, 7))
# print(add(b=3, a=7))

a = 0
def func():
    global a # 전역변수 참조
    a += 1

for i in range(10):
    func()

# print(a)

array = [1,2,3,4,5]

def func():
    array = [3,4,5] # 지역변수가 우선
    array.append(6)
    print(array)
# func()

# 여러개의 반환값을 가질 수 있다.
def operator(a, b):
    add_var = a + b
    sub_var = a - b
    mul_var = a * b
    div_var = a / b
    return add_var, sub_var, mul_var, div_var

a, b, c, d = operator(7, 3)
# print(a, b, c, d)

# 람다 표현식
# print((lambda a, b: a + b)(3, 7))

array = [('홍길동', 50), ('이순신', 32), ('아무개', 74)]
def my_key(x):
    print(x[0])
    print(x[1])
    return x[1] * -1

# 인자로 함수가 들어갈 경우
print(sorted(array, key=my_key))
print(sorted(array, key=lambda x: x[1]))

# 여러개의 리스트에 적용 시
list1 = [1,2,3,4,5]
list2 = [6,7,8,9,10]
result = map(lambda a, b: a + b, list1, list2) # map : 각각의 원소에 어떠한 함수를 적용
print(list(result))