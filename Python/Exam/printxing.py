if __name__ == "__main__":
    x = int(input("请输入一个小于20的整数："))
    for i in range(1,x+1):
        print("{:0>3}".format(i),"*"*(i))
    print("{:=^20}".format("PYTHON"))