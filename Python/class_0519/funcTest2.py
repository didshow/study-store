if __name__ == "__main__":
    def fib(n):
        a,b=0,1
        while a<n:
            print(a,end=' ')
            a,b=b,a+b
        print()
    print(fib(10))