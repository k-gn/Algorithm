class Node:
    
    def __init__(self, data):
        self.data = data
        self.next = None
   
def add(data):
    node = head
    while node.next: # 다음 주소가 있다면
        # print(node.next)
        node = node.next
    node.next = Node(data)

node1 = Node(1)
node2 = Node(2)

node1.next = node2
head = node1 # 가장 앞

for i in range(1, 10):
    add(i)

# node = head
# while node.next:
#     print(node.data)
#     node = node.next
# print(node.data)

# 데이터 추가/삭제
node3 = Node(1.5)
node = head
search = True
while search:
    if node.data == 1:
        search = False
    else:
        node = node.next

node_next = node.next
node.next = node3
node3.next = node_next

node = head
while node.next:
    print(node.data)
    node = node.next
print(node.data)
