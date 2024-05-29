if __name__=="__main__":
    print(int)                                  # <class 'int'>
    i=-10
    print(int(),int(123),int("456"),int(1.23))  # 0 123 456 1
    print(i.bit_length(),int.bit_length(i))     # 4 4
    print(3.14)
    print(float)                        # <class 'float'>
    print(float(123),float('3.14'))     # 123.0 3.14
    print(float('Infinity'),float('-Infinity'),float('NaN'))  # inf -inf nan
    # float('123abc')   ValueError: could not convert string to float: '123abc'
