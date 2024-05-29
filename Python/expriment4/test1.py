if __name__ == "__main__":
    s1=(1,2,3)
    print(s1)
    print(s1[2])
    print(any((1,2,0)))     # True any里面少了一个()都会报错
    print(all([1,2,0]))     # False
    t1 = (1,2,3,4)
    a=sum(t1)
    print(a)    # 10
    # t2=(1,'a',2)
    # s='1234'
    # b=sum(s)
    # print(b)  # TypeError: unsupported operand type(s) for +: 'int' and 'str'
    print(sum([[1,2],[3,4]],[]))    # [1, 2, 3, 4]
    s = 'abcdefg'
    r1=len(s)
    r2=max(s)
    r3=min(s)
    s2 = ''
    r4=len(s2)
    print(r1,r2,r3,r4)  # 7 g a 0
    t = (10,2,3)
    q1 = len(t)
    q2 = max(t)
    q3 = min(t)
    t2 = ()
    q4 = len(t2)
    print(q1,q2,q3,q4)  # 3 10 2 0
    lst = [1,2,9,5,4]
    w1 = len(lst)
    w2 = max(lst)
    w3 = min(lst)
    lst2 = []
    w4 = lst2
    print(w1,w2,w3,w4)  # 5 9 1 []

