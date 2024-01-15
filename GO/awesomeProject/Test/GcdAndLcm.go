/*
输入两个正整数m和n，求其最大公约数和最小公倍数。
输入两个正整数m和n，求其最大公约数和最小公倍数。

输入格式:
请输入第一个正整数 m：
请输入第二个正整数 n：

输出格式:
最大公约数为：4
最小公倍数为：48

输入样例:
12
16

输出样例:
最大公约数为：4
最小公倍数为：48
*/
package main

import (
	"fmt"
)

func gcd(m, n int) int {
	for n != 0 {
		m, n = n, m%n
	}
	return m
}

// 计算最小公倍数
func lcm(m, n int) int {
	return m * n / gcd(m, n)
}

func main() {
	var m, n int
	fmt.Print("请输入第一个正整数 m：")
	fmt.Scanln(&m)
	fmt.Print("请输入第二个正整数 n：")
	fmt.Scanln(&n)

	fmt.Printf("最大公约数为：%d\n", gcd(m, n))
	fmt.Printf("最小公倍数为：%d\n", lcm(m, n))
}
