hash_table = [0 for i in range(10)]

def get_key(data): # 해쉬 키 생성
    return hash(data)

def hash_func(key): # 해쉬 함수
    return key % 8


def save_data(data, value):
    index_key = get_key(data)
    
    hash_address = hash_func(index_key)
    if hash_table[hash_address] != 0:
        for i in range(hash_address, len(hash_table)):
            if hash_table[i] == 0: # insert
                hash_table[i] = [index_key, value]
                return
            elif hash_table[i][0] == index_key: # update
                hash_table[i][1] = value
                return
            
    else:
        hash_table[hash_address] = [index_key, value] # insert
    
    
def read_data(data):
    index_key = get_key(data)
    hash_address = hash_func(index_key)
    if hash_table[hash_address] != 0:
        for i in range(hash_address, len(hash_table)):
            if hash_table[i] == 0:
                return None
            elif hash_table[i][0] == index_key:
                return hash_table[i][1]
        return None
    else:
        return None
    

save_data("Dbs", "1234")
save_data("Data", "5678")
save_data("daveds", "7878")

# print(hash_table)

# print(read_data("Dbs"))


import hashlib

data = 'test'.encode('utf-8') # 문자열을 바이트로 변환
print(data)
hash_obj = hashlib.sha256()
hash_obj.update(data) # 바이트 상태에서 해쉬로 변환 가능
hex_dig = hash_obj.hexdigest() # 16진수로 추출
print(hex_dig)
print(int(hex_dig, 16))