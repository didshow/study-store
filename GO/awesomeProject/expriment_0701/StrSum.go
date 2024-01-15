/*
各位数字之和
从键盘输入一个整数（不超过10的9次方），输出其各位数字之和。

输入格式:
一个整数

输出格式:
该整数各位数字之和

输入样例:
123456789

输出样例:
45
*/
package main

import (
	"fmt"
)

func SumDight(n int) int {
	sum := 0
	for n > 0 {
		dight := n % 10
		sum += dight
		n /= 10
	}
	return sum
}
func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(SumDight(n))
}
