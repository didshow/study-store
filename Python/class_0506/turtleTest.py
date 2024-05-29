'''
>turtle用法：
    turtle是python自带的
    setup(width,height,startX,startY):设置画布位置和大小
    setup(width,height):位置默认居中，设置画布大小
    python计算生态=标准库+第三方库
    绘制窗体：单位px
    fd(d):前进 bd(d):后退
    seth(angle):改变角度
    left(angle):向左转 right(angle):向右转
    RGB
>导入库import的用法：
    ①import<库名>
    ②from<库名>import<函数名> （as t）：t为别名
    第一种方法不会出现方法重名
> 库：math | radon
> 对象模型
    ①数字：int float complex
    ②字符串：str
    ③字节串：bytes
    ④列表：list
    ⑤
> 对象类型
    ①集合：set frontset
'''
import turtle
if __name__ == '__main__':
    turtle.setup(650, 350, 200, 200)
# penup():拿起画笔，还没开始写
turtle.penup()
# 前进，负值则是向后退
turtle.fd(-250)
turtle.pendown()
# 画笔的粗细、海龟的大小
turtle.pensize()
turtle.pensize(25)
# 海龟的颜色
turtle.pencolor("green")
turtle.seth(-40)
for i in range(4):
# circle(r,弧度)
    turtle.circle(40, 80)
    turtle.circle(-40, 80)
turtle.circle(40, 80 / 2)
turtle.fd(40)
turtle.circle(16, 180)
turtle.fd(40 * 2 / 3)
# 结束
turtle.done
