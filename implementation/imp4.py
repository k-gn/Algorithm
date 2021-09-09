# 문자열 재정렬
# 알파벳 대문자와 숫자로 구성된 문자열에서
# 알파벳을 오름차순 정렬 후 모든 숫자를 더한 값을 이어서 출력

data = input()

result = []
value = 0

for i in data:
    if i.isalpha():
        result.append(i)
    else:
        value += int(i)
        
result.sort()

if value != 0:
    result.append(str(value))
    
print(result)
     

