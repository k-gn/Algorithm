# 사용자로부터 입력을 최대한 빠르게 받아야 하는 경우 사용하는 라이브러리
import sys
data = sys.stdin.readline().rstrip()
print(data)

a = input('num : ')
print(a)

# map() : 리스트의 모든 원소에 각각 특정한 함수를 적용
# 한줄에 공백을 기준으로 구분된 데이터를 입력받기
datas = list(map(int, input().split()))
datas.sort(reverse=True)
print(datas)
# 한줄에 공백을 기준으로 구분된 데이터의 개수가 많지 않을 경우
a, b, c = map(int, input().split())
print(a, b, c)

n = int(input("n : "))
print(n, end=" ") # end= : 줄바꿈 발생 X

# f-string
answer = 7
print(f"정답은 {answer} 입니다.")