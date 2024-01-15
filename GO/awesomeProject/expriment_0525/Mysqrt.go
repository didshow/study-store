/*
x的平方根
给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

输入格式:
大于0小于2^32-1

输出格式:
返回类型是整数，小数部分将被舍去

输入样例:
8

输出样例:
2
*/
package main

import (
	"fmt"
	"math"
)

func main() {
	var a int
	fmt.Scan(&a)
	fmt.Println(MySqrt(a))
}
func MySqrt(x int) int {
	if x == 0 {
		return 0
	}
	ans := int(math.Exp(0.5 * math.Log(float64(x))))
	if (ans+1)*(ans+1) != x {
		return ans
	}
	return ans - 1
}
