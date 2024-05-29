import cmath

if __name__ == "__main__":
    print(1+2j) #(1+2j)
    print(type(1+2j))   #<class 'complex'>
    print(complex)      #<class 'complex'>
    c = complex(4, 5)   #(4+5j)
    print(c)
    a=1+2j
    print(a)#(1+2j)
    b=complex(4,5)
    print(a+b)#(5+7j)
    d=cmath.sqrt(b)
    print(d)    #(2.280693341665298+1.096157889501519j)
