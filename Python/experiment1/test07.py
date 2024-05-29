import turtle

if __name__ == "__main__":
    print("初始位置：",turtle.pos())
    turtle.forward(50)
    print("第一次操作后的位置：",turtle.pos())
    turtle.forward(200)
    print("第二次操作后的位置：",turtle.pos())
    turtle.undo()
    print("第三次操作后的位置：",turtle.pos())
    turtle.home()
    print("第四次操作后位置：",turtle.pos())
    turtle.exitonclick()