'''
温度转换
    其中的变量：TempStr | C | F
    数据类型：字符串 | 整数 | 浮点数 | 列表 例如：['F', 'f']
    字符串序号体系：正向从 0 ~ length-1; 负向从 -length ~ -1
    = 赋值 ；== 判断
    函数eval(<string>):评估函数，去掉参数最外侧引号并执行余下语句的函数{慎用，容易被攻击}
    数字相关内置函数：Bool int float complex数据型、Bin otc hex进制转换、Abs sum数字运算
    数据结构相关：List reversed ...
    输出函数
    循环语句：for i in range(<计数值>):
'''
if __name__ == '__main__':
    TempStr = input("请输入带有符号的温度值：")
# 判断单位是F还是C
if TempStr[-1] in ['F', 'f']:
    # eval转换为数字，[0:-1]表示从列表中第一个数据取到最后一个
    # 但是不取最后一个，也就是不取其中的单位，只取数值进行运算。
    C = (eval(TempStr[0:1]) - 32) / 1.8
    # 打印C的值：保留两位小数；format打印
    print("转换后的温度是{:.2f}C".format(C))
elif TempStr[-1] in ['C', 'c']:
    F = 1.8 * eval(TempStr[0:1]) + 32
    print("转换后的温度是{:.2f}F".format(F))
else:
    print("输入格式错误")

