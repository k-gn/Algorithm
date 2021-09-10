# 두 배열의 원소 교체
# 최종 목표는 A 배열의 모든 원소의 합이 최대가 되는 것
# 매번 배열 A에서 가장 작은 원소를 고른 후, 배열 B에서 가장 큰 원소와 교체
# A = 오름차순, B = 내림차순 정렬

n, k = map(int, input().split())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort(reverse=True)

for i in range(k):
    if a[i] < b[i]:
        a[i], b[i] = b[i], a[i]
    else:
        break;
    
print(sum(a))