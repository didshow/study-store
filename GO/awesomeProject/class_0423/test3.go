package main

import (
	"fmt"
	"math"
)

func main() {
	var (
		a  float64
		b  float64
		c  float64
		d  float64
		r1 float64
		r2 float64
	)
	fmt.Println("请输入a,b,c的值：(float64)")
	fmt.Scanf("%f %f %f \n", &a, &b, &c)
	d = b*b - 4*a*c
	if d > 0 {
		r1 = (-b + math.Sqrt(d)) / 2 * a
		r2 = (-b - math.Sqrt(d)) / 2 * a
		fmt.Print("第一个解为：", r1, "\n第二个解为：", r2)
	} else if d == 0 {
		r1 = (-b + math.Sqrt(d)) / 2 * a
		r2 = r1
		fmt.Print("第一个解==第二个解为：\n", r1)
	} else {
		fmt.Println("方程无解")
	}
}
