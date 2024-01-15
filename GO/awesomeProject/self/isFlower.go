package main

import "fmt"

func isFlower(n int) bool {
	sum := 0
	tmp := n
	for n > 0 {
		dight := n % 10
		sum += dight * dight * dight
		n /= 10
	}
	return tmp == sum
}
func main() {
	var x, y int
	fmt.Scan(&x, &y)
	for i := x; i <= y; i++ {
		if isFlower(i) {
			fmt.Println(i)
		}
	}
}
