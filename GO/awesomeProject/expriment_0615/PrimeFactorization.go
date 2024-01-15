/*
质因数分解
输入一个数字n(n是正整数)，将其分解为质因数的乘积。
返回一个由质因数组成的切片

输入格式:
输入一个正整数

输出格式:
质因数组成的切片

输入样例:
24

输出样例:
[2 2 2 3]
*/
package main

import "fmt"

func primeFactorization(n int) []int {
	factors := make([]int, 0)
	for i := 2; i <= n; i++ {
		for n%i == 0 {
			factors = append(factors, i)
			n /= i
		}
	}
	return factors
}

func main() {
	var n int
	fmt.Scan(&n)

	// 求质因数分解
	factors := primeFactorization(n)

	// 输出结果
	fmt.Println(factors)
}
