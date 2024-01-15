package main

import "fmt"

func main() {
	continueTest()
}
func breakTest() {
	for i := 1; i < 10; i++ {
		fmt.Println("i =", i)
	breakD: //label
		for j := 1; j < 6; j++ {
			fmt.Println("j =", j)
			if j == 3 {
				break breakD
			}
		}
	}
}
func continueTest() {
	for j := 0; j < 5; j++ {
		fmt.Println("j=", j)
		if j == 3 {
			continue
		}
	}
}
