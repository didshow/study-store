from turtle import *
# 太阳花
if __name__ == "__main__":
    color('red','yellow')
    begin_fill()
    while True:
        fd(200)
        left(170)
        if abs(pos())<1:
            break
    end_fill()
    done()