import turtle

if __name__ == "__main__":
    def koch(size,n):
        if n == 0:
            turtle.fd(size)
        else:
            for angle in [0,60,-120,60]:
                turtle.left(angle)
                koch(size/3,n-1)