package main

import "fmt"

func main() {
	var k int
	for {
		fmt.Println("请输入k的值：")
		fmt.Scanf("%d \n", &k)
		if k == -1 {
			break
		} else {
			fmt.Println("k的值为:", k)
		}
	}
}
