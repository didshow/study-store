/*
求范围内的所有素数与素数和
给定一个范围区间[x,y]
求范围内的所有素数，以及他们的和

输入格式:
输入在一行中给出2个整数A和B。

输出格式:
第一行输出 [A,B]范围内的所有素数，左右两边用"[","]" 包裹，
若无素数则输出"[]",每两个数用空格隔开
第二行输出 [A,B]范围内的这些素数的和

输入样例:
2 10

输出样例:
[2 3 5 7]
17
*/
package main

import (
	"fmt"
	"math"
)

func isPrime(n int) bool {
	if n < 2 {
		return false
	} else {
		for i := 2; i < int(math.Sqrt(float64(n)))+1; i++ {
			if n%i == 0 {
				return false
			}
		}
	}
	return true
}
func PrimeSum(a, b int) (int, []int) {
	var prime []int
	sum := 0
	for i := a; i <= b; i++ {
		if isPrime(i) {
			sum += i
			prime = append(prime, i)
		}
	}
	return sum, prime
}
func main() {
	var (
		a int
		b int
	)
	fmt.Scanf("%d %d", &a, &b)
	sum, prime := PrimeSum(a, b)
	fmt.Print("[")
	for i := 0; i < len(prime); i++ {
		if i != len(prime)-1 {
			fmt.Printf("%d ", prime[i])
		} else {
			fmt.Printf("%d", prime[i])
		}

	}
	fmt.Print("]\n")
	fmt.Println(sum)
}
