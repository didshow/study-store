import datetime

if __name__ == "__main__":
    name=input("请输入您的姓名：")
    birthday=input("请输入您的出生年份：")
    age=int(datetime.date.today().year)-int(birthday)
    print("您好！Mary。您{}岁".format(age))
