# 삽입정렬
# 하나씩 골라 적절한 위치에 삽입
# 앞쪽 데이터는 이미 정렬되었다고 가정

array = [7,5,9,0,3,1,6,2,4,8]

# O(N2)
for i in range(1, len(array)):
    for j in range(i, 0, -1):
        if array[j] < array[j - 1]:
            array[j], array[j - 1] = array[j - 1], array[j]
        else:
            break
    
print(array) 