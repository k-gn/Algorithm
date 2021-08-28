class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
    
class NodeMgmt:
    def __init__(self, data):
        self.head = Node(data)
    
    def add(self, data):
        if self.head == '':
            self.head = Node(data)
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = Node(data)
        
    def desc(self):
        node = self.head
        while node:
            print(node.data)
            node = node.next
            
    def delete(self, data):
        if self.head == '':
            print("해당 값을 가진 노드가 없습니다.")
            return
        
        if self.head.data == data:
            temp = self.head
            self.head = self.head.next
            del temp
        else:
            node = self.head
            while node.next:
                if node.next.data == data:
                    temp = node.next
                    node.next = node.next.next
                    del temp        
                else:
                    node = node.next
                    
    def search(self, data):
        node = self.head
        while node.next:
            if node.data == data:
                return node
            else:
                node = node.next
        
linked1 = NodeMgmt(0)
# linked1.desc()

for data in range(1, 10):
    linked1.add(data)
    
linked1.desc()
linked1.delete(0)
linked1.desc()