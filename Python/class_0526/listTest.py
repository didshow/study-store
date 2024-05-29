'''
    >列表元素的增加
    列表的insert()可以在列表的任意位置插入元素，但由于列表的紫红内存管理功能
    insert()方法会涉及到插入位置后所有元素的移动
'''
if __name__ == "__main__":
    aList=[3,5,7]
    blist = aList # [3,5,7]
    print(blist)
    x = [[None]*2]*3 # [[None,None],..3个]

    x[0][0]=5
    x= [[1,2,3]]*3  # [[1, 2, 3], [1, 2, 3], [1, 2, 3]]
    print(x)
    a_list = list((3,5,7,9,11))
    a_list.remove(7)
    print(a_list)   # [3, 5, 9, 11]
    # 删掉列表里所有的1
    y = [1,2,1,2,1,2,1,2,1]

    print(y)    #[2, 2, 2, 2]
    y = [1,2,1,2,1,1,1]
    for i in y:
        if i == 1:
            y.remove(i) #[2, 2, 1]
    print(y)
    z= y = [1,2,1,2,1,1,1]
    for i in y[::]:
        if i == 1:
            z.remove(i)
    print(z)    #[2,2]
    '''
        列表元素的访问与计数
        使用列表对象的index()方法获取指定元素首次出现的下表，若列表对象中不存在指定元素，则抛出异常
    '''
    A=aList.index(7)
    print(A)    # 2
    # aList.index(100)
    B=aList.count(7)
    print(B)    # 1

