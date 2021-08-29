import hashlib

hash_table = [0 for i in range(10)]

def get_key(data): # 해쉬 키 생성
    hash_obj = hashlib.sha256()
    hash_obj.update(data.encode())
    hex_dig = hash_obj.hexdigest()
    return int(hex_dig, 16) # 16진수를 10진수로 변환

def hash_func(key): # 해쉬 함수
    return key % 8


def save_data(data, value):
    index_key = get_key(data)
    
    hash_address = hash_func(index_key)
    if hash_table[hash_address] != 0: # 충돌
        for i in range(len(hash_table[hash_address])):
            if hash_table[hash_address][i][0] == index_key:
                hash_table[hash_address][i][1] = value
                return
        hash_table[hash_address].append([index_key, value])
    else:
        hash_table[hash_address] = [[index_key, value]]
    
    
def read_data(data):
    index_key = get_key(data)
    hash_address = hash_func(index_key)
    if hash_table[hash_address] != 0:
        for i in range(len(hash_table[hash_address])):
            if hash_table[hash_address][i][0] == index_key:
                return hash_table[hash_address][i][1]
        return None
    else:
        return None
    

save_data("Dbs", "1234")
save_data("Data", "5678")
save_data("daveds", "7878")

print(hash_table)

print(read_data("Dbs"))