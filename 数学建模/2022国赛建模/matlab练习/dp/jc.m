% 要计算n！
function f = jc(n)
    if n == 1
        f = 1; 
    else 
        f = n*jc(n-1);
    end
end