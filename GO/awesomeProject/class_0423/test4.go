package main

import "fmt"

func main() {
	var (
		n int
	)
	fmt.Scanf("%d \n", &n)
	for i := 0; i < n; i++ {
		fmt.Print("第", i, "个数为：", i, "\n")
	}
}
