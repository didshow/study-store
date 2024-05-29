'''
    函数是一种功能抽象，一般函数表达特定功能
    函数是一段具有特定功能的、可重用的语句组
>语法格式:
    def <函数名> (<参数列表>):
        <函数体>
        return <返回值列表>
*注意事项：函数形参不需要声明其类型，也不需要指定函数返回值类型
         即使该函数不需要接收任何参数，也必须保留一对空的圆括号
         括号后面的冒号不可少
         函数可以嵌套
'''


if __name__ == "__main__":
    # 生日歌
    def happy():
        print("Happy birthday to you!")

    def happyB(name):
        happy()
        happy()
        print("Happy birthday,dear {}!".format(name))

    happy()
    happyB("Mike")
    print()
    happyB("Lily")

    # 计算n的阶乘
    def fact(n):
        s = 1
        for i in range(1, n + 1):
            s *= i
        return s
    print(fact(10))