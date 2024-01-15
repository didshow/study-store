/*
杨辉三角
给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。

在「杨辉三角」中，每个数是它左上方和右上方的数的和。

输入格式:
输入一个非负整数

输出格式:
输出杨辉三角的每一行

输入样例:
5

输出样例:
[[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]
*/
package main

import "fmt"

func generate(numRows int) [][]int {
	triangle := make([][]int, numRows)
	for i := 0; i < numRows; i++ {
		row := make([]int, i+1)
		row[0], row[i] = 1, 1
		for j := 1; j < i; j++ {
			row[j] = triangle[i-1][j-1] + triangle[i-1][j]
		}
		triangle[i] = row
	}
	return triangle
}

func main() {
	var numRows int
	fmt.Scan(&numRows)

	triangle := generate(numRows)

	// 输出结果
	fmt.Println(triangle)
}
