from random import *
if __name__ == "__main__":
    def fun(x):
        return x**3
    ls1 = []
    while (len(ls1)<5):
        i=randint(0,9)
        if i not in ls1:
            ls1.append(i)
    print("排序前",ls1)