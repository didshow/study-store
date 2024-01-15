/*
斐波那契数列
输出所需长度的斐波那契数列

输入格式:
输入一个整数为数列的长度

输出格式:
输出对应长度的斐波那契数列，每个数字用空格隔开

输入样例:
4

输出样例:
1 1 2 3
*/
package main

import (
	"fmt"
)

func Fab(n int) int {
	if n == 1 || n == 2 {
		return 1
	} else {
		return Fab(n-1) + Fab(n-2)
	}
}
func main() {
	var n int
	fmt.Scanf("%d", &n)
	for i := 1; i <= n; i++ {
		fmt.Printf("%d ", Fab(i))
	}
}
