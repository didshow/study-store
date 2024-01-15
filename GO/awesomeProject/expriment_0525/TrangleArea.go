/*
输入三角形的三边长a、b、c(边长可以是小数)，
求三角形面积area，并输出,结果保留两位小数
输入三角形的三边长a、b、c(边长可以是小数)，
求三角形面积area，并输出。如果输入的三边构不成三角形，
应给出“data error”的信息提示。
注：根据“海伦－秦九韶”公式，area＝√p(p-a)(p-b)(p-c)，
其中p＝(a+b+c)/2。
编程可用素材：printf("\nplease input triange sides:")...
printf("Output:\ndata error\n")...
printf("Output:\narea=...\n"...。

输入格式:
3 4 5

输出格式:
6.00

输入样例:
4 5 8

输出样例:
8.18
*/
package main

import (
	"fmt"
	"math"
)

func main() {
	var a float64
	var b float64
	var c float64
	fmt.Scanln(&a, &b, &c)
	if a+b > c && a+c > b && b+c > a {
		p := (a + b + c) / 2
		area := math.Sqrt(p * (p - a) * (p - b) * (p - c))

		fmt.Printf("%.2f\n", area)
	} else {
		fmt.Println("data error")
	}
}
