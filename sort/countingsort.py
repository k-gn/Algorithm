# 계수 정렬
# 특정한 조건이 부합할 때만 사용할 수 있는 매우 빠른 정렬
# 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때 사용 가능
# 데이터 개수가 N, 데이터 중 최대값이 K 일 때 O(N + K)
# 데이터와 동일한 인덱스에 COUNT 값을 증가시키는 방식
# 출력은 첫번째 인덱스 부터 값만큼 반복하여 인덱스 출력
# 동일한 값을 가진 데이터가 여러개 있을 때 효과적 (ex. 학생 중 100점을 맞은 학생은 여러명일 수 있다.)

array = [7,5,9,0,3,1,4,2,8,6]

count = [0] * (max(array) + 1)

for i in range(len(array)):
    count[array[i]] += 1
    
for i in range(len(count)):
    for j in range(count[i]):
        print(i, end=" ")