if __name__=="__main__":
    num=input("请输入数字：")
    reverseNum=reversed(list(num))
    if list(num) == list(reverseNum):
        print("{}是回文数字".format(num))
    else:
        print("{}不是回文数字".format(num))
