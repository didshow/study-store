if __name__ == "__main__":
    a = [2,5,8]
    b = input("请输入三个数字：").split(",")
    # 将字符串类型转换为int整形
    b=[int(num) for num in b]
    total=0
    for i in range(len(a)):
        total+=a[i]*b[i]
    print(total)
