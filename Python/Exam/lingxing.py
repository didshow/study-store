import turtle as t
if __name__ == "__main__":
    t.setup(1000,1000, 100, 200)
    t.right(-30)
    for i in range(2):
        t.fd(200)
        t.right(60*(i+1))
    for i in range(2):
        t.fd(200)
        t.right(60*(i+1))
        