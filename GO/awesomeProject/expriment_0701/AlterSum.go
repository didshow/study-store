/*
求简单交错序列前N项和
本题要求编写程序,计算序列 1 - 1/5 + 1/9 - 1/13 + ... 的前N项之和。

输入格式:
输入在一行中给出一个正整数N

输出格式:
在一行中按照“sum = S”的格式输出部分和的值S，精确到小数点后六位，
请注意等号的左右各有一个空格。题目保证计算结果不超过双精度范围。

输入样例:
5

输出样例:
sum = 0.893012
 */
package main

import (
	"fmt"
)

func AlterSum(n int) float64 {
	sum := 0.0
	for i := 0; i < n; i++ {
		if i%2 == 0 {
			sum += 1 / (1 + float64(i)*4)
		} else {
			sum -= 1 / (1 + float64(i)*4)
		}
	}
	return sum
}
func main() {
	var n int
	fmt.Scan(&n)
	r := AlterSum(n)
	fmt.Printf("sum = %.6f\n", r)
}
