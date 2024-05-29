if __name__ == "__main__":
    num=input("请输入一个小于二十的整数：")
    if int(num)<20 :
        for i in range(int(num)+1):
            if i > 0:
                print("{:0>3}".format(i),'*'*i)
    else:
        print("Incorrect input")