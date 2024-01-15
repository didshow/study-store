package main

import "fmt"

func isNum(n int) bool {
	sum := 0
	tmp := n
	for n > 0 {
		dight := n % 10
		sum += dight * dight * dight
		n /= 10
	}
	return sum == tmp
}

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	for i := a; i <= b; i++ {
		if isNum(i) {
			fmt.Println(i)
		}
	}
}
