/*
成绩评价
输入一个成绩，输出对于该成绩的评价。

编程可用素材:

	fmt.Print("请输入成绩：")

fmt.Println("成绩不及格！")

输入格式:
数字

输出格式:
成绩优秀！：当输入的成绩大于等于 90 分时，
程序会输出“成绩优秀！”；
成绩良好！：当输入的成绩大于等于 80 分但小于 90 分时，
程序会输出“成绩良好！”；
成绩及格！：当输入的成绩大于等于 60 分但小于 80 分时，
程序会输出“成绩及格！”；
成绩不及格！：当输入的成绩小于 60 分时，
程序会输出“成绩不及格！”。

输入样例:
90

输出样例:
成绩优秀！
*/
package main

import "fmt"

func Evaluate(num int) {
	if num >= 90 {
		fmt.Println("成绩优秀！")
	} else if num >= 80 && num < 90 {
		fmt.Println("成绩良好！")
	} else if num >= 60 && num < 80 {
		fmt.Println("成绩及格！")
	} else if num >= 0 && num < 60 {
		fmt.Println("成绩不及格！")
	} else {
		fmt.Println("错误数字")
	}
}
func main() {
	var n int
	fmt.Scanf("%d", &n)
	Evaluate(n)
}
