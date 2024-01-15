package main

import "fmt"

func main() {
	var (
		x int = 10
		y int = 20
	)
	fmt.Println(x, y)

	swap(&x, &y)

	fmt.Println(x, y)

}
func swap(x *int, y *int) {
	tmp := *x
	*x = *y
	*y = tmp
}
