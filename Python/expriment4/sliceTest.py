if __name__ == "__main__":
    s = 'abcdef'
    print(s[1:3])   # bc
    print(s[3:10])  # def
    print(s[8:2])   # 空行
    print(s[:])     # abcdef
    print(s[:2])    # ab
    print(s[::2])   # ace
    print(s[::-1])  # fedcba
    t = ('a','e','i','o','u')
    print(t[-2:-1]) # ('o',)
    print(t[-2:])   # ('o', 'u')
    print(t[-99:-5])# ()
    print(t[-99:-3])# ('a', 'e')
    print(t[::])    # ('a', 'e', 'i', 'o', 'u')
    print(t[1:-1])  # ('e', 'i', 'o'):左闭右开
    print(t[1::2])  # ('e', 'o')：步长为2