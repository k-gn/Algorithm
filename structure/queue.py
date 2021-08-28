
queue_list = list()

def enqueue(data):
    queue_list.append(data)

def dequeue():
    data = queue_list[0]
    del queue_list[0]
    return data

for i in range(10):
    enqueue(i)

print(len(queue_list))
print(dequeue())
print(len(queue_list))

import queue

data_queue = queue.Queue()
data_queue.put(5)
data_queue.put(7)
print(data_queue.qsize())
print(data_queue.get())
print(data_queue.qsize())

# LIFO Queue
data_queue = queue.LifoQueue()
data_queue.put("hello")
data_queue.put("world")
print(data_queue.qsize())
print(data_queue.get())
print(data_queue.qsize())

# Priority Queue
data_queue = queue.PriorityQueue()
data_queue.put((10, "hello"))
data_queue.put((8, "world")) # 수가 낮을 수록 우선 순위가 높다.
data_queue.put((9, "!!"))
print(data_queue.qsize())
print(data_queue.get())
print(data_queue.qsize())
