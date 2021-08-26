# 조건문

array = [1,2,3,4,5]
x = 15

if x >= 10:
    print("x >= 10")
elif x >= 0:
    print("x >= 0")
else:
    print("else")
    
if True or False:
    print("Yes!")
    
if x <= 15 and x >= 0: {
    print("yes!")
}

# in, not in
if x in array:
    print("yes in")
elif x not in array:
    print("yes not in")
    
# 아무것도 처리하고 싶지 않을 때 pass 키워드 사용
# 형태만 만들어 놓고 나중에 처리할 때
if True:
    pass

# 조건문 간소화
score = 85
result = "Success" if score >= 80 else "Fail"
print(result)

# 수학의 부등식을 그대로 사용 가능
if 0 < x < 20:
    print("yes!")