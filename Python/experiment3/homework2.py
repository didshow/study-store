if __name__ == "__main__":

    count = 0
    sum = 0
    while(True):
        grade = input("请输入学生成绩（按Q或q结束）：")
        if (grade == "Q" or grade == "q"):
            break
        if (int(grade) < 0):
            continue
        count += 1
        sum += int(grade)
    if count != 0:
        print("学生人数为：{}，平均成绩为：{}".format(count, sum/count))
    else:
        print("学生人数为：{}，平均成绩为：{:.1f}".format(count, 0))