/*
列出完数
输入一个整数n，要求输出[1，n]范围内的所有完数。完数是一个正整数，该数恰好等于其所有不同真因子之和。例如，6、28是完数，因为6=1+2+3，28=1+2+4+7+14；而24不是完数，因为24≠1+2+3+4+6+8+12＝36。

输入格式:
测试数据有多组，处理到文件尾。每组测试数据输入一个整数n（1≤n≤10000）。

输出格式:
对于每组测试，首先输出n和一个冒号“:”；然后输出所有不大于n的完数（每个数据之前留一个空格）；若[1，n]范围内不存在完数，则输出“NULL”。引号不必输出。具体输出格式参考输出样例。

输入样例:
100
5000
5

输出样例:
100: 6 28
5000: 6 28 496
5: NULL
*/
package main

import (
	"fmt"
)

func isPerfect(n int) bool {
	sum := 0
	for i := 1; i < n; i++ {
		if n%i == 0 {
			sum += i
		}
	}
	return n == sum
}
func main() {
	var n int
	for {
		_, err := fmt.Scan(&n)
		if err != nil {
			break
		}
		fmt.Printf("%d:", n)
		res := []int{}
		for i := 1; i <= n; i++ {
			if isPerfect(i) {
				res = append(res, i)
			}
		}
		if len(res) == 0 {
			fmt.Printf(" %s", "NULL")
		} else {
			for i := 0; i < len(res); i++ {
				fmt.Printf(" %d", res[i])
			}
		}
		fmt.Println()
	}
}
