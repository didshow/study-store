'''
    切片是python序列的重要操作之一，使用2个冒号分隔的3个数字来完成
    浅复制
    sort()原地排序
'''
if __name__ == "__main__":
    aList = [3,4,5,6,7,9,11,13,15,17]
    a1 = aList[::]
    a2 = aList[::-1] # 逆序
    print(a1,a2)    # [3, 4, 5, 6, 7, 9, 11, 13, 15, 17] [17, 15, 13, 11, 9, 7, 6, 5, 4, 3]
    del aList[:3]   # 删除前三个元素
    print(aList)
    a3=aList.sort()
    print(a3)
    aList.sort(reverse=True)
    print(aList)
    # 内置函数sorted()
    sorted(aList)
    print(aList)
    aList.reverse()
    print(aList)
    newList = reversed(aList)
    a4=list(newList)
    print(a4)
    for i in newList:
        print(i,end=' ')
    newList = reversed(aList)
    for i in newList:
        print(i,end=' ')