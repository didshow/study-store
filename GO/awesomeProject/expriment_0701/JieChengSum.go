/*
求阶乘之和
请编写程序，输入 n (n≤20)，计算并输出从 0 到 n 的阶乘之和。

0!+1!+2!+3+⋯+n!

输入格式:
n

输出格式:
阶乘之和

输入样例:
4

输出样例:
34
*/
package main

import (
	"fmt"
)

func Jie(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	return n * Jie(n-1)
}
func Sum(n int) int {
	sum := 0
	for i := 0; i <= n; i++ {
		sum += Jie(i)
	}
	return sum
}
func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(Sum(n))
}
