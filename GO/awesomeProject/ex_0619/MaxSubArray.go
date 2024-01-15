package main

import "fmt"

func MaxSubArray(a []int) []int {
	res := make([]int, 0)
	for i := 0; i < len(a); i++ {
		for j := i; j < len(a); j++ {
			if a[j] < a[j+1] {

			}
		}
	}
	return res
}

func main() {
	var n int
	fmt.Scanln(&n)
	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	res := MaxSubArray(a)
	for i := 0; i < len(res); i++ {
		fmt.Printf("%d ", res[i])
	}
}
