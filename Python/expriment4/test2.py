if __name__ == "__main__":
    s = 'abcdef'
    print(s[0])     # a
    print(s[-1])    # f
    print(s[-3])    # d
    t = ('a','e','i','o','u')
    print(t[0])     # a
    print(t[-1])    # u
    print(t[-5])    # a
    lst = [1,2,3,4,5]
    print(lst[0])   # 1
    print(lst)      # [1, 2, 3, 4, 5]
    lst[2] = 'a'
    print(lst)      # [1, 2, 'a', 4, 5]