import numpy as np
import pandas as pd
from scipy.optimize import linprog
import matplotlib.pyplot as plt

# 读取 Excel 文件中的数据
filename1 = 'Annex I.xlsx'
range1 = ''
Data1 = ((pd.read_excel(filename1, header=None).values)[2:,1:9])
d = np.sum(Data1, axis=0)

filename2 = 'Annex II.xlsx'
range2 = ''
range3 = ''
Data2 = ((pd.read_excel(filename2, header=None).values)[2:,1:9])
Data3 = ((pd.read_excel(filename2, header=None).values)[2:,-1])
# Data4 = pd.read_excel(filename2, header=None).values
z = Data2.T
# w=Data4[2, 1:10]



a = np.arange(0, 0.0011, 0.0001)
f = Data3 + 3.8
lb = np.zeros(10)
A = -z
Q = np.zeros(len(a))
XX = []
# Variables = [8.88178420e-15,0,0,0,1.99800000e+00,0,0,0,0]
for i in range(len(a)):
    b = (a[i] - 1) * d
    res = linprog(c=f.flatten(), A_ub=A, b_ub=b, bounds=(0, None), method='highs', options={'disp': False})
    Q[i] = res.fun
    XX.append(res.x)
min_cost_index = np.argmin(Q)
min_cost = Q[min_cost_index]
min_cost_variables = XX[min_cost_index]

# min_money = min_cost*3.8 + Variables*w

print("最低成本:", min_cost)
# print("最低成本：",min_money[0])
print("对应的变量值:", min_cost_variables)

plt.plot(a, Q, '*r')
plt.xlabel('剩余污垢百分比')
plt.ylabel('最低成本')
plt.show()