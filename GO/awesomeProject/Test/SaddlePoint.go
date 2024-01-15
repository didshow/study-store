/*
求鞍点
给定一个n*m矩阵A。矩阵A的鞍点是一个位置（i，j），
在该位置上的元素是第 i 行上的最大数，第 j 列上的最小数。
一个矩阵A也可能没有鞍点。你的任务是找出A的鞍点。。

输入格式:
自行输入一个二维数组,二维数组的长度才从键盘读入

输出格式:
对输入的矩阵，如果找到鞍点，就输出其下标。
下标为两个数字，第一个数字是行号，第二个数字是列号，均从0开始计数。

如果找不到，就输出 找不到鞍点

输入样例:
2 3 1 2 3 4 5 6

输出样例:
鞍点为2(0,1)
*/
package main

import "fmt"

func findSaddlePoint(matrix [][]int) (int, [2]int) {
	n := len(matrix)
	m := len(matrix[0])
	maxInRow := make([]int, n) // 存储每行最大值的数组

	// 找出每行的最大值
	for i := 0; i < n; i++ {
		maxInRow[i] = matrix[i][0]
		for j := 1; j < m; j++ {
			if matrix[i][j] > maxInRow[i] {
				maxInRow[i] = matrix[i][j]
			}
		}
	}

	// 遍历每列，找出每列的最小值，与所在行的最大值比较，如果相等就是鞍点
	for j := 0; j < m; j++ {
		minInCol := matrix[0][j]
		index := 0
		for i := 1; i < n; i++ {
			if matrix[i][j] < minInCol {
				minInCol = matrix[i][j]
				index = i
			}
		}
		if minInCol == maxInRow[index] {
			return minInCol, [2]int{index, j}
		}
	}

	// 没有找到鞍点
	return -1, [2]int{-1, -1}
}

func main() {
	var n, m int
	fmt.Scan(&n, &m)

	// 读取矩阵
	matrix := make([][]int, n)
	for i := 0; i < n; i++ {
		matrix[i] = make([]int, n)
		for j := 0; j < n; j++ {
			fmt.Scan(&matrix[i][j])
		}
	}

	// 查找鞍点
	value, index := findSaddlePoint(matrix)

	// 输出结果
	if value != -1 {
		fmt.Printf("鞍点为%d(%d,%d)", value, index[0], index[1])
	} else {
		fmt.Println("找不到鞍点")
	}
}
