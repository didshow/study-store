package main

import (
	"fmt"
)

func SortCoin(n int) int {
	sum := 0
	count := 1
	for i := 0; i <= n; i++ {
		sum += i
		count++
		if sum == n {
			return count
		}
		if sum > n {
			return count - 1
		}
	}
	return -1
}
func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(SortCoin(n))
}
