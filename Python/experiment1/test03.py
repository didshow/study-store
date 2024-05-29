if __name__ == "__main__":
    def fun():
        i=0
        while True:
            yield i
            i+=1
    g=fun()
    print(next(g))
