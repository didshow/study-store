if __name__ == "__main__":
    string1 = input("请输入你的字符：")
    count_en = 0
    count_digit = 0
    count_ch = 0
    count_space = 0
    count_other = 0
    for c in string1:
        if c >= u'\u4e00' and  c <= u'\u9fa5':
            count_ch += 1
        elif c.isalpha():
            count_en += 1
        elif c.isdigit():
            count_digit += 1
        elif c.isspace():
            count_space += 1
        else:
            count_other += 1
    print("有{}个空格,{}个数字,{}个中文,{}个英文字符,{}个其他字符".
          format(count_space,count_digit,count_ch,count_en,count_other))
