% clc是清除命令行窗口，clear是清除存储空间的变量
clc,clear;

Data1 = readmatrix('第一组.xlsx');%衣物污染物矩阵
d=sum(Data1);%单种污染物求和;

% Data1 = readmatrix('第二组.xlsx');%衣物污染物矩阵
% d=sum(Data1);%单种污染物求和;
% 
% Data1 = readmatrix('第三组.xlsx');%衣物污染物矩阵
% d=sum(Data1);%单种污染物求和;
% 
% Data1 = readmatrix('第四组.xlsx');%衣物污染物矩阵
% d=sum(Data1);%单种污染物求和;


filename2 = 'Annex II.xlsx'; % Excel文件的名称
range2 = 'B3:I12'; % 想要读取的Excel区域
range3 = 'J3:J12'; % 想要读取的Excel区域
Data2 = readmatrix(filename2,  'Range', range2);%洗涤剂去污能力矩阵
Data3 = readmatrix(filename2,  'Range', range3);%洗涤剂单价
z=Data2';

% a矩阵的元素是不同剩余污染物，从0到0.001等差取值，相邻两个数相差0.0001
a =0.001;     
f = [Data3+3.8];      % 目标函数的系数向量 
A=-z;
lb = zeros(10,1);
% 利用矩阵Q存储污垢百分比a(i)下最低的成本；for循环中i在变化，风险率a(i)不同，求出对应的最优解存在矩阵Q内
b=(a-1)*d';
[x,y] = linprog(f,A,b,[],[],lb);      % 调用linprog函数

disp('最低成本');
disp(y);
disp('洗涤剂使用情况：');
disp(x);


