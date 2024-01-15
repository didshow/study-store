package main

import "fmt"

func MySqrt(n float64) int {
	index := 0
	for i := 0; i <= int(n)/2+1; i++ {
		if int(n) >= i*i && int(n) <= (i+1)*(i+1) {
			index = i
			return i
		}
	}
	return index
}
func main() {
	var n float64
	fmt.Scanf("%f", &n)
	fmt.Println(MySqrt(n))
}
