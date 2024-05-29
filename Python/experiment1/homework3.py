if __name__ == "__main__":
    str1="1234"
    str2="5678"
    str3="abcd"
    str4="efgh"
    def fun():
        dilist=[list(str1),list(str2),list(str3),list(str4)]
        print("--横板--")
        for i in range(4):
            for j in range(4):
                if j==3:
                    yield dilist[i][j]+'\n'
                else:
                    yield dilist[i][j]
    for i in fun():
        print(i,end='')

    dilist1=[list(str1),list(str2),list(str3),list(str4)]
    print("--竖版--")
    for i in range(len(list(str1))):
       for j in range(len(dilist1)):
           print(dilist1[j][i],end='')
       print('')