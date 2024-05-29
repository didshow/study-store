'''
> 字符串类型的表示：由单引号或者双引号表示
    x + y : 连接两个字符串和x、y
    n * x ： 将x复制n次
> 转义字符：\b : 退格 \f ：换页 \n：换行 \r ：回车 \t ：水平制表符 \v：垂直制表符
> 字符串处理函数：以函数形式提供的字符串处理功能
    len(x): 返回x长度
    str(x): 任意类型x所对应的字符串形式
    hex(x): 转换为十六进制
    oct(x): 转换为八进制
    chr(u): u是Unicode编码，函数返回对应字符
    ord(x): x是字符，返回Unicode编码
> 内置字符串处理函数：
    + : 连接 * ： 重复
    len(string): 长度
    <string>.strip(): 剔除指定字符，取出两边空格
    join(): 连接两个字符串序列
    find(): 搜索指定字符串
    replace(): 字符串替换
    #format() : 格式化
> 方法字符串处理功能：
    str.lower() str.upper()
    str.split(sep=None) : 返回一个列表，由str根据sep被分隔的部分组成
    str.count(sub): 返回字串sub一共出现了多少次
    str.replace(old,new): 返回字符串str副本，所有old子串被替换为new
    str.center(width[,fillchar]):字符串str根据宽度width居中,fillchar默认为” “
    str.strip(chars)：从str中去掉在其左侧和右侧的chars中列出的字符
    str.join(iter): 在iter变量除最后元素外每个元素后增加一个str','.join("12345")
>
    '''

if __name__ == "__main__":
    r=ord("a")
    print(r)
    for i in range(12):
        print(chr(9800+i))
    print("python".center(20,"="))
    print("= python= ".strip(" =np"))
    print("123".join('wrxyx'))
    # maxsplit=-1时，全部分开，默认以空格开始
    print("I like python".split(maxsplit=3))
    # 用0填充
    print("123".zfill(20))



