package main

import "fmt"

func main() {
	var (
		sum int
		m   int
	)
	fmt.Scanf("%d \n", &m)
	for i := 1; i <= m; i++ {
		sum += i
	}
	fmt.Println("sum为：", sum)
}
