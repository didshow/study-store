package main

import "fmt"

/*
*
百元百鸡
*/
func main() {
	var (
		x int
		y int
		z int
	)
	for x = 0; x < 20; x++ {
		for y = 0; y < 33; y++ {
			z = 100 - x - y
			if z%3 == 0 && 5*x+3*y+z/3 == 100 {
				fmt.Println("公鸡有", x, "只时\t母鸡有", y, "只\t小鸡有", z, "只")
			}
		}
	}
}
