import numpy as np
import pandas as pd
from scipy.optimize import linprog

# 清除命令行窗口和变量存储空间
import os
os.system('cls')
clear = lambda: os.system('cls')

clear()

# Data1 = pd.read_excel('第一组.xlsx').to_numpy()  # 衣物污染物矩阵
# d = np.sum(Data1, axis=0)  # 单种污染物求和

# Data1 = pd.read_excel('第二组.xlsx').to_numpy()  # 衣物污染物矩阵
# d = np.sum(Data1, axis=0)  # 单种污染物求和
#
# Data1 = pd.read_excel('第三组.xlsx').to_numpy()  # 衣物污染物矩阵
# d = np.sum(Data1, axis=0)  # 单种污染物求和
#
Data1 = pd.read_excel('第四组.xlsx').to_numpy()  # 衣物污染物矩阵
d = np.sum(Data1, axis=0)  # 单种污染物求和

filename2 = 'Annex II.xlsx'  # Excel文件的名称
range2 = ''  # 想要读取的Excel区域
range3 = ''  # 想要读取的Excel区域
# 洗涤剂去污能力矩阵
Data2 = ((pd.read_excel(filename2, header=None).values)[2:,1:9])
Data3 = ((pd.read_excel(filename2, header=None).values)[2:,-1])  # 洗涤剂单价
z = np.transpose(Data2)

# a矩阵的元素是不同剩余污染物，从0到0.001等差取值，相邻两个数相差0.0001
a = 0.001
f = np.transpose(Data3 + 3.8)  # 目标函数的系数向量
A = -z
# 利用矩阵Q存储污垢百分比a(i)下最低的成本；for循环中i在变化，风险率a(i)不同，求出对应的最优解存在矩阵Q内
b = (a - 1) * d
lb = np.zeros(10)  # 将 lb 转换为一维数组
bounds = [(lb[i], None) for i in range(len(lb))]  # 设置下界为 lb 中的值，上界为 None
res = linprog(c=f.flatten(), A_ub=A, b_ub=b, bounds=bounds, method='highs')

x = res.x
y = res.fun

print('最低成本:')
print(y)
print('洗涤剂使用情况:')
print(x)