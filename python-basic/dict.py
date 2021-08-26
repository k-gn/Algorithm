# 키와 값의 쌍을 데이터로 가지는 자료형
data = dict()
data['사과'] = 'apple'
data['바나나'] = 'banana'
print(data)

if '사과' in data:
    print('apple')
    
key_list = data.keys()
value_list = data.values()
print(key_list)
print(value_list)

for key in key_list:
    print(data[key])
    
b = {
    '홍길동' : 97,
    '이순신' : 98
}

print(b)