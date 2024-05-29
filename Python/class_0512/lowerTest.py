if __name__ == "__main__":
    def lower(a):
        return chr(ord(a)-32)
    def upper(a):
        return chr(ord(a)+32)
    #字符串格式化:%7.3（长度7位，精度保留后三位）
    a=3.6654
    print('%7.3f'%a)
    # %d:打印整数，%c打印对应Unicode
    print('%d:%c'%(65,65))
    # 字符串类型的格式化 ：:引导符号 填充：用于填充字符 对齐：默认左对齐 宽度： <,>：用=填充 <.精度>:保留小数点后几位 <类型>：
    print("{}:计算机{}的CPU占用率为{}%".format("2018-10-10","c",10))
    print("{0:,.2f}".format(12345.6789))


