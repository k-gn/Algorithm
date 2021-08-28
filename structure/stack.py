stack_list = list()

# stack_list.append(1)
# stack_list.append(2)

# print(stack_list)

# stack_list.pop()
# print(stack_list)


def push(data):
    stack_list.append(data)
    
def pop():
    data = stack_list[-1]
    del stack_list[-1]
    return data

push(1)
push(2)
print(stack_list)
pop()
print(stack_list)