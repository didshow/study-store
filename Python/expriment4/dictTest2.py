'''
找出任意自古串中只出现一次的字符，如果有多个字符 请全部找出
'''
if __name__ == "__main__":
    s = input("请输入一个英文字符串：")
    dict1={}
    for ch in s:
        dict1[ch]=dict1.get(ch,0)+1
    list1=[k for k,v in dict1.items() if v == 1]
    print(list1)    # ['d', ' ']