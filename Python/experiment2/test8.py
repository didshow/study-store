if __name__ == "__main__":
    # 判断是否为偶数
    def is_odd(x):
        return x % 2 == 1
    print(list(filter(is_odd,range(10))))
    # 判断回文数
    def is_palindrome(x):
        if str(x) == str(x)[::-1]:
            return x
    print(list(filter(is_palindrome,range(100,1000))))
    x=list(filter(lambda  x:x%2==1,range(10)))
    print(x)
    y=list(filter(lambda x:x>0,[1,0,-2]))
    print(y)
