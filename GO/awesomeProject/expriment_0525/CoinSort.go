/*
排列硬币
你总共有n枚硬币，并计划将它们按阶梯状排列。
对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。
阶梯的最后一行 可能 是不完整的。

给你一个数字n ，计算并返回可形成 完整阶梯行 的总行数。

输入 5
输出 2

解释5相当于
*
* *
* *
最后一行不完整，故返回2

输入格式:
n大于等于1

输出格式:
输出行数

输入样例:
8

输出样例:
3
*/
package main

import (
	"fmt"
	"math"
)

func arrangeCoins(n int) int {
	return int((math.Sqrt(float64(8*n+1)) - 1) / 2)
}

func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(arrangeCoins(n))
}
