# 곱하기 혹은 더하기
# 앞에서 부터 차례대로 연산
# 만들어질 수 있는 가장 큰 수를 구하기
# 두 수 중에서 하나라도 0 또는 1 인 경우, 더하기가 효율적, 그 외엔 곱하기

data = input()

result = int(data[0])

for i in range(1, len(data)):
    
    num = int(data[i])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num
print(result)