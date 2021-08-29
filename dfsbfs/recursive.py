def recursive_func(i):
    if i == 100:
        return
    print(i, '번째 재귀함수에서 ', i+1, '번째 재귀함수를 호출합니다.')
    recursive_func(i + 1)
    print(i, '번째 재귀함수를 종료합니다.')

# recursive_func(90)

# 팩토리얼 (5! = 1 x 2 x 3 x 4 x 5)
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)


# 유클리드 호제법 
# 두 자연수 A, B 에 대해 (A > B) A를 B로 나눈 나머지가 R 일 때
# A와 B의 최대 공약수는 B와 R의 최대 공약수와 같다.
def gcd(a, b):
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)
    
