'''
    seed(a=None)：初始化随机数种子，默认值为系统当前时间
    random()：生成一个[0.0,1.0] 之间的随机小数
    randint(a,b): 生成一个[a,b]之间的随机整数
>扩展随机数函数:
    choice(seq) :
'''
import datetime
import random

if __name__ == "__main__":
    x=random.random()
    y=random.randint(1,101)
    print(x,y)
    now=datetime.datetime.now()
    print(now)
