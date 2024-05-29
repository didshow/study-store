'''
移除每个单词的空格，并查找以a或者A开头并且以c结尾的所有单词
'''
if __name__ == "__main__":
    li = ["alex "," aric"," Alex","Tony "," rain"]
    for i in li:
        v = i.strip()
        if v.endswith('c'):
            if v.startswith('a') or v.startswith("A"):
                print(v)    # aric
