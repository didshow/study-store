if __name__ == "__main__":
    print(True,False) # True False
    print(type(True),type(False))   #<class 'bool'> <class 'bool'>
    print(bool(0))  #False
    print(not 0)    # True
    print(not 'a')  # False
    print(1 or 2)   # 1
    print(0 or 2)   # 2
    print(False or True)    # True
    print(True or False)    # True
    print(1 and 2)          # 2
    print(0 and 2)          # 0
    print(False and 2)      # False
    print(True and 2)       # 2