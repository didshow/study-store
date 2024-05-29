if __name__ == "__main__":
    sum = 0
    fact = 1
    n = 1
    while (True) :
        term = 1/fact
        if(term<1e-6):
            break
        sum += term
        fact = fact*n
        n += 1
        print("sum={:.6f}".format(sum))