if __name__ == "__main__":
    a1 = sum(range(1,11))   # 55
    a2 = sum(range(1,11),5) # 60
    a3 = sum([[1,2],[3],[4]],[])    # [1, 2, 3, 4]
    print(a1,a2,a3)

    a4 = sum([1,2,3,4])
    #a5 = sum([[1,2],[3,4]])
    a6 = sum([1,2,3],4)
    a7 = sum((1,2,3,4))
    print(a4,a6,a7)
    '''
        列表推导式
    '''
    a8 = sum([2**i for i in range(64)])
    print(a8)