# 1이 될때까지 문제
# n / k or n - 1 을 반복

n, k = map(int, input().split())

result = 0;

# while n >= k:
#     result += 1
#     if n % k == 0:
#         n //= k
#     else:
#         n -= 1

while True:
    target = (n // k) * k # 가장 가깝게 나눈 수 
    result += (n - target) # 1을 빼는 과정을 대체
    n = target # n 이 더 빠르게 줄어든다.
    print("target : ", target)
    print("result : ", result)
    print("n : ", n)
    
    if n < k:
        break
    
    result += 1
    n //= k

result += (n - 1)
print(result)
