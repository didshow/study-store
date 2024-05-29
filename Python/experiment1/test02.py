import math

if __name__ == '__main__':
    # 求面积
    area = lambda x:math.pi*x*x
    print(area(10))
    # 求斜边
    ledge = lambda x,y:math.sqrt(x*x+y*y)
    print(ledge(3,4))


