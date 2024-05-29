if __name__ == "__main__":
    s1 = 'abc'
    s2 = 'xyz'
    print(s1+s2)    # abcxyz
    print(s1*3)     # abcabcabc
    s1+=s2
    print(s1)       # abcxyz
    s2*=2
    print(s2)       # xyzxyz
    t1 = (1,2)
    t2 = ('a','b')
    print(t1+t2)    # (1, 2, 'a', 'b')
    print(t1*2)     # (1, 2, 1, 2)
