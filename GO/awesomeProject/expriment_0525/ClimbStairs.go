/*
爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。
你有多少种不同的方法可以爬到楼顶呢？

输入格式:
n属于[1,45]的整数

输出格式:
输出有几种方法

输入样例:
4

输出样例:
5
*/
package main

import "fmt"

func climbStairs(n int) int {
	if n == 1 {
		return 1
	}
	if n == 2 {
		return 2
	}
	a, b := 1, 2
	for i := 3; i <= n; i++ {
		a, b = b, a+b
	}
	return b
}

func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(climbStairs(n))
}
