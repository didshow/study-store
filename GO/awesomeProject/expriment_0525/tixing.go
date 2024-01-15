/*
画梯形
输入一个数字，根据数字画梯形

输入格式:
输入：

输出格式:
一个小于10的数字

输入样例:
5

输出样例:

	   ********************
		******************
		 ****************
		  **************
		   ************
*/
package main

import "fmt"

func main() {
	var num int
	fmt.Scanln(&num)

	// 绘制上半部分的梯形
	for i := 0; i < num; i++ {
		// 绘制左侧空格
		for j := 0; j < i; j++ {
			fmt.Print(" ")
		}
		// 绘制梯形上半部分
		for j := 0; j < 20-2*i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}

	// 绘制下半部分的梯形
	//for i := 0; i < num; i++ {
	//	// 绘制左侧空格
	//	for j := 0; j < num-i-1; j++ {
	//		fmt.Print(" ")
	//	}
	//	// 绘制梯形下半部分
	//	for j := 0; j < 2*i+1; j++ {
	//		fmt.Print("*")
	//	}
	//	fmt.Println()
	//}
}
