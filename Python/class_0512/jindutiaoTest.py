'''
> 文本进度条：采用字符串方式打印可以动态变化的文本进度条
    * 获取进度条的变化时间：sleep()
'''
import time

if __name__ == "__main__":
    # 简单例子：静态进度条
    scale=10
    print("--- 执行开始 ---")
    for i in range(scale+1):
        a='*'*i
        b='.'*(scale-i)
        c=(i/scale)*100
        # :3表示长度为3
        print("{:3.0f}%[{}->{}]".format(c,a,b))
    # 休眠0.1秒
    time.sleep(0.1)
    print("--- 执行结束 ---")
    print("--- 单行 ---")
    # 单行动态刷新【关键是\r】：本质为用之后打印的字符覆盖之前打印的字符
    for i in range(101):
        print("\r{:3}%".format(i),end="")
        time.sleep(0.1)
    print("--- 完整效果 ---")
    print("执行开始".center(50//2,"-"))
    start=time.perf_counter()
    for i in range(51):
        a='*'*i
        b='.'*(50-i)
        c=(i/50)*100
    dur = time.perf_counter()-start
    print("\r{:^3.0f}%[{}->{}]{:.2f}s".format(c,a,b,dur),end="")
    time.sleep(0,1)
    print("\n"+"执行结束".center(50//2,'-'))


