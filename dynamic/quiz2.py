# 1로 만들기
x = int(input()) # 26

d = [0] * 30001

for i in range(2, x + 1):
    d[i] = d[i - 1] + 1
    print("i - 1 : ", i, d[:10])
    if i % 2 == 0:
        d[i] = min(d[i], d[i // 2] + 1)
        print("i % 2 : ", i, d[:10])
    if i % 3 == 0:
        d[i] = min(d[i], d[i // 3] + 1) 
        print("i % 3 : ", i, d[:10])
    if i % 5 == 0:
        d[i] = min(d[i], d[i // 5] + 1)
        print("i % 3 : ", i, d[:10])
        
print(d[:30])
print(d[x])

# count = 0;
# while x > 1:
#     count += 1
#     if x % 5 == 0:
#         x //= 5
#     elif x % 3 == 0:
#         x //= 3
#     elif x % 2 == 0:
#         x //= 2
#     else:
#         x -= 1
# print(count)