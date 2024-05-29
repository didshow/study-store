import numpy as np
from scipy.optimize import linprog

# 初始参数
n = 10  # 清洗次数
C0 = 100  # 初始污垢量
V_total = 500  # 可用水量
C_limit = C0 / 1000  # 最终的污垢残留量不超过初始污垢量的千分之一
Ck_values = [C0]

# 表2中的洗涤剂数据
a_values = np.zeros(n)
a_values[0] = 0.80
for k in range(1, n):
    a_values[k] = 0.5 * a_values[k-1]

P_values = np.random.rand(n)  # 洗涤剂的单位价格，这里随机生成

# 定义线性规划问题
c = np.concatenate((P_values, np.ones(n)))  # 目标函数系数
A_eq = np.zeros((1, 2*n))  # 等式约束矩阵
b_eq = np.zeros(1)  # 等式约束右侧

# 设置等式约束矩阵和右侧
for k in range(1, n+1):
    A_eq = np.vstack((A_eq, np.zeros((k+1, 2*n))))
    A_eq[k, :k] = -a_values[:k]
    A_eq[k, n+k-1] = C0
    b_eq = np.hstack((b_eq, Ck_values[-1]))

# 设置水量限制
A_ub = np.zeros((1, 2*n))  # 不等式约束矩阵
b_ub = np.array([V_total])  # 不等式约束右侧
A_ub[0, n:] = 1

# 设置边界
bounds = [(0, None) for _ in range(2*n)]

# 使用线性规划求解
result = linprog(c, A_eq=A_eq[1:, :], b_eq=b_eq[1:], A_ub=A_ub, b_ub=b_ub, bounds=bounds, method='highs')

# 提取最优解
optimal_D_values = result.x[:n]
optimal_V_values = result.x[n:]

# 输出结果
print("最省成本又能够有效清洁的方案：")
print("最优的洗涤剂使用量：", optimal_D_values)
print("最优的水量使用量：", optimal_V_values)
print("最小总成本：", result.fun)