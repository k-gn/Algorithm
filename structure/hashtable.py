hash_table = [0 for i in range(10)]
# print(hash_table)

def get_key(data): # 해쉬 키 생성
    return hash(data)

def hash_func(key): # 해쉬 함수
    return key % 8

data1 = 'andy'
data2 = 'dave'
data3 = 'trump'

# ord() : 문자의 아스키코드 리턴
print(ord(data1[0]), ord(data2[0]), ord(data3[0]))
print(hash_func(ord(data1[0])))

def storage_data(data, value):
    key = ord(data[0])
    hash_address = hash_func(key)
    hash_table[hash_address] = value
    
storage_data(data1, "0000")
storage_data(data2, "1111")
storage_data(data3, "2222")

def get_data(data):
    key = ord(data[0])
    hash_address = hash_func(key)
    return hash_table[hash_address]

print(get_data(data1))

def save_data(data, value):
    hash_address = hash_func(get_key(data))
    hash_table[hash_address] = value
    
def read_data(data, value):
    hash_address = hash_func(get_key(data))
    return hash_table[hash_address]