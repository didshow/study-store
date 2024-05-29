if __name__ == "__main__":
    str1 = "k:1|k1:2|k2:3|k3:4"
    dic = {}
    lst = str1.split("|")
    for l in lst:
        lst2 = l.split(":")
        dic[lst2[0]] = eval(lst2[1])
    print(dic)  # {'k': 1, 'k1': 2, 'k2': 3, 'k3': 4}