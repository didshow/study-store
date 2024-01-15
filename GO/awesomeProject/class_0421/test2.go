package main

import (
	"fmt"
	"math"
)

func main() {
	var (
		a float64
		b float64
		c float64
	)
	fmt.Println("Please input a,b,c")
	fmt.Scanf("%f %f %f", &a, &b, &c)
	var s float64 = (a + b + c) / 2
	var area float64 = math.Sqrt(s * (s - a) * (s - b) * (s - c))
	fmt.Print("s is : ", s)
	fmt.Println("")
	fmt.Print("area is : ", area)
}
