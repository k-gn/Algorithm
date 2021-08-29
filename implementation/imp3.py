# 왕실의 나이트 문제

from typing import SupportsRound


input_data = input()

row = int(input_data[1])
column = int(ord(input_data[0])) - int(ord('a')) + 1 # 문자를 숫자로

steps = [(-2, -1), (-1, -2), (-2, 1), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2)] # 나이트가 움직일 수 있는 모든 경우의 수

result = 0

for step in steps:
    next_row = row + step[0]
    next_column = column + step[1]
    
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result += 1
        
print(result)