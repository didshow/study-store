package main

import (
	"fmt"
	"math"
)

func getArea(a, b, c float64) float64 {
	s:=(a+b+c)/2
	return math.Sqrt(s*(s-a)*(s-b)*(s-c))
}

func main() {
	var a,b,c float64
	fmt.Scan(&a,&b,&c)
	area:=getArea(a,b,c)
	fmt.Println(area)
}