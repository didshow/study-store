if __name__ == "__main__":
    hobbies = []
    n = 0
    while (n<3):
        enjoys = input("请输入爱好之一（最多三个，按Q或q结束）：")

        if (enjoys == "Q" or enjoys == "q"):
            break
        n += 1
        hobbies.append(enjoys)
    print("您输入了{}个爱好。".format(n))
    print("您的爱好为："," ".join(hobbies))
