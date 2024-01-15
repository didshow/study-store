/*
输入格式:
测试数据有多组，处理到文件尾。每组测试输入一正整数N（1≤N≤1000000）。

输出格式:
对于每组测试，输出占一行，如果输入的正整数是素数，则输出其排位，否则输出0。

输入样例:
6
2
6
4
5
13
991703

输出样例:
1
0
0
3
6
77901
*/

package main

import (
	"fmt"
	"math"
)

func IsPrime(n int) bool {
	if n <= 1 {
		return false
	}
	// 判断 n 是否可以被 2~sqrt(n) 中的任意一个数整除
	for i := 2; i <= int(math.Sqrt(float64(n))); i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}
func PrimeSort(num int) int {
	count := 1
	if IsPrime(num) {
		if num == 2 {
			return count
		}
		for j := 3; j <= num; j += 2 {
			if IsPrime(j) {
				count++
			}
			if j == num {
				return count
				break
			}
		}
	}
	return 0
}
func main() {
	var (
		n int
		r []int
	)
	fmt.Scanf("%d\n", &n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scanln(&arr[i])
	}

	for i := 0; i < len(arr); i++ {
		r = append(r, PrimeSort(arr[i]))
	}
	for i := 0; i < len(r); i++ {
		fmt.Println(r[i])
	}

}
