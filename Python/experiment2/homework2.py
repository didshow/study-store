if __name__ == "__main__":
    mem = input("请输入每个团体的人数（顺序不限），各个团体之间由空格间隔：").split()
    members = 0
    singleMem = 0
    for i in mem[1:]:
        i = int(i)
        if i % 2 == 0:
            singleMem = i/2
        else:
            singleMem = i/2+1
        members += singleMem
    print("至少需要{}人支持他，他才可以当选".format(int(members)))

