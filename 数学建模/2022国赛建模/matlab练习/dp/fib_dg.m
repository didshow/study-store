function f = fib_dg(n)
    if n == 1 || n == 2
        f = 1;
    else 
        f = fib_dg(n-1)+fib_dg(n-2);
    end
end