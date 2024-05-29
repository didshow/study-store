import hashlib
'''
    > 结果：
        result0 = 226cf119b78825f1720cf2ca485c2d85113d68c6
        result1 = 5cf1fa8d836a5e82ead36fb0854a6a68a4b8f7542038a346357d2424ddb60f5e
        result2 = 29d682805e8ecb265551f92923bdea6f8e393d961a396ef172697f58895441b79869df557e432dbc736464f0364f3fcce5a231bda442e4ef9c21013a58ae2b5f
'''
if __name__ == "__main__":
    data="testing"
    result0=hashlib.sha1(str.encode("utf-8")).hexdigest()
    result1=hashlib.sha256(str.encode("utf-8")).hexdigest()
    result2=hashlib.sha512(str.encode("utf-8")).hexdigest()
    for i in range(3):
        print("result"+str(i),'=',eval("result"+str(i)))
    '''
    > 结果：
        f246094678d3fb55959f993ac29b7166c18238a9c640b56d23b21fd8425abf95
        f246094678d3fb55959f993ac29b7166c18238a9c640b56d23b21fd8425abf95
        True
    '''
    text1="blockchain with python"
    text2="blockchain with python"
    hash1=hashlib.sha256(text1.encode("utf-8"))
    hash2=hashlib.sha256(text2.encode("utf-8"))
    print(hash1.hexdigest())
    print(hash2.hexdigest())
    print(hash1.hexdigest()==hash2.hexdigest())