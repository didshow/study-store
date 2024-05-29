'''
    > 结果：0.010000,the result is 7.92
'''
if __name__ == "__main__":
    dayup = 1
    dayfactor = 0.01
    for j in range(1,366):
        if j%7 in [4,5,6,0]:
            dayup = dayup * (1+dayfactor)
    print('%f,the result is %.2f' %(dayfactor,dayup))