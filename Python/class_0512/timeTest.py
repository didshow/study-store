'''
> time库：Python中处理时间的标准库
    import time
    三类函数：时间获取 时间格式化 程序计时
    * 时间获取：time()【获取当前时间戳】 ctime()【获取当前时间并以易读方式表示，返回字符串】 gmtime()【获取当前时间，表示为计算机可处理的时间格式】
    * 时间格式化：strftime(tpl,ts)【tpl是格式化模板字符串，用来定义输出效果，ts是计算机内部时间类型变量】
        格式化控制符：%Y-%m-%d %H:%M:%S
                strftime(str,tpl)【反向操作】
    * 程序计时：perf_counter()【返回一个CPU级别的精确时间计数值，单位为秒；连续调用才有效】 sleep(s)【s拟休眠的时间】
'''
import time

if __name__ == "__main__":
    # time():计算机内部时间,返回浮点数
    print(time.time())
    # 易读 星期 月份 日期 时刻 年份
    print(time.ctime())

    print(time.gmtime())