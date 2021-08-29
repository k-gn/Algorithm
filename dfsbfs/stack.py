stack = []

stack.append(5);
stack.append(2);
stack.append(3);
stack.append(7);

stack.pop()
stack.pop()
stack.pop()

print(stack[::-1]) # a[start : end : step]