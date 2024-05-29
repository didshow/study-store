if __name__ == "__main__":
    # 1 1 2 3 5 8 13 21 34 55
    def Fab(t):
        fab = []
        fab.append(1)
        fab.append(1)
        if t <= 0:
            return 1

        while fab[len(fab)-1] <= t:
            fab.append(fab[len(fab)-1]+fab[len(fab)-2])
        return fab[len(fab)-1]
    n = int(input("请输入一个整数："))
    result = Fab(n)
    print("斐波拉契数列中第一个大于{}的数为：{}".format(n, result))

