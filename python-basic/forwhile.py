i = 1
result = 0

while i <= 9:
    if i % 2 == 1:
        result += i
    i += 1
    
print(result)

array = [1,2,3,4,5]
# 배열 요소를 하나씩 방문 후 출력
for i in array:
    print(i)

# 연속적인 값 순회 (인자가 하나면 시작값은 자동으로 0으로 됨)
for i in range(1, 10):
    if i % 2 == 0:
        continue # 건너뛰기
    print(i, end=" ")

i = 1

while True:
    print("현재 i의 값 : ", i)
    if i == 5:
        break # 탈출
    i += 1
    
score = [90, 85, 77, 65, 97]
cheating_stuList = {2, 4}

for i in range(len(score)):
    if i + 1 in cheating_stuList:
        continue
    if score[i] >= 80:
        print(i + 1, "번 학생은 합격입니다.")
        
for i in range(2, 10):
    for j in range(1, 10):
        print(i, "x", j, "=", i * j)
    print()