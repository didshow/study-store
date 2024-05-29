# 阶乘之和
if __name__ == "__main__":
    sum,tmp=0,1
    for i in range(1,11):
        tmp*=i
        sum+=tmp
    print('运算结果是：{}'.format(sum))