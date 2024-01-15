package main

import "fmt"

func isHappy(n int) bool {
	seen := make(map[int]bool, n)
	sum := 0
	for !seen[n] && sum != 1 {
		for n > 0 {
			seen[n] = true
			dight := n % 10
			sum += dight * dight
			n /= 10
		}
		n = sum
	}
	return n == 1
}
func main() {
	var n int
	fmt.Scanf("%d", &n)
	fmt.Println(isHappy(n))
}
