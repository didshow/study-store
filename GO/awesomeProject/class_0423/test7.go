package main

import "fmt"

func main() {
	var (
		str string = "hello cuit"
	)
	for index, c := range str {
		fmt.Printf("%d%c ", index, c)
	}
	fmt.Println()
	for i := 0; i < len(str); i++ {
		fmt.Printf(" %c ", str[i])
	}
}
