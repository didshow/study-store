package main

import "fmt"

func main() {
	var (
		age int
	)
	fmt.Scanf("%d \n", &age)
	if age < 18 {
		fmt.Println("未成年！")
	} else {
		fmt.Println("已成年！")
	}
}
