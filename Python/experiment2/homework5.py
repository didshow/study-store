if __name__ == "__main__":
    for num in range(1000, 10000):
        digits = set(str(num))  # 将数字转换为字符串，并使用集合过滤重复的数字
        if len(digits) == 4 and sum(int(d) for d in digits) == 6 and num % 11 == 0:
            print(num)