/*
螺旋矩阵
所谓“螺旋矩阵”，是指对任意给定的N，将1到N×N的数字从左上角第1个格子开始，
按顺时针螺旋方向顺序填入N×N的方阵里。本题要求构造这样的螺旋方阵。

输入格式:
输入在一行中给出一个正整数N（<10）。

输出格式:
输出N×N的螺旋方阵。每行N个数字，每个数字占4位。

输入样例:
5

输出样例:

	 1   2   3   4   5
	16  17  18  19   6
	15  24  25  20   7
	14  23  22  21   8
	13  12  11  10   9
*/
package main

import (
	"fmt"
)

type Direction int

const (
	Right Direction = 0
	Down  Direction = 1
	Left  Direction = 2
	Up    Direction = 3
)

func generateMatrix(n int) [][]int {
	matrix := make([][]int, n)
	for i := 0; i < n; i++ {
		matrix[i] = make([]int, n)
	}

	num := 1
	i, j := 0, 0
	minRow, maxRow, minCol, maxCol := 0, n-1, 0, n-1
	direction := Right

	for num <= n*n {
		matrix[i][j] = num
		num++

		switch direction {
		case Right:
			if j == maxCol {
				direction = Down
				i++
				minRow++
			} else {
				j++
			}
		case Down:
			if i == maxRow {
				direction = Left
				j--
				maxCol--
			} else {
				i++
			}
		case Left:
			if j == minCol {
				direction = Up
				i--
				maxRow--
			} else {
				j--
			}
		case Up:
			if i == minRow {
				direction = Right
				j++
				minCol++
			} else {
				i--
			}
		}
	}

	return matrix
}

func main() {
	var n int
	fmt.Scan(&n)
	matrix := generateMatrix(n)
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			fmt.Printf("%4d ", matrix[i][j])
		}
		fmt.Println()
	}
}
