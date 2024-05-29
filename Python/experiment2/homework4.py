if __name__ == "__main__":
    a = [1, 34, 2, 1, 9, True, False, 1, "True", 3, 1]
    # a = str(a)
    count1 = 0
    for str in a:
        if str == 1 :
            count1 += 1
    print("一共有{}个1".format(count1))