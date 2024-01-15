/*
输出“水仙花数”
输出介于a,b（含a,b，且a<=b）的所有“水仙花数”。
所谓“水仙花数”是指一个数，其各位数字立方和等于该数本身。
例如，153是一个“水仙花数”

输入格式:
100 200

输出格式:
153

输入样例:
100 900

输出样例:
153
370
371
407
*/
package main

import "fmt"

func main() {
	var (
		a int
		b int
	)
	fmt.Scanf("%d %d", &a, &b)
	for i := a; i <= b; i++ {
		n := i
		sumOf3 := 0
		for n > 0 {
			dight := n % 10
			sumOf3 += dight * dight * dight
			n /= 10
		}
		if sumOf3 == i {
			fmt.Println(i)
		}
	}
}
