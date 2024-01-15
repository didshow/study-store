/*
数字三角形
输入一个正整数n和一个数字字符c，输出n行由字符为c构成的三角形。
格式参照输出样例。注意，每行的行末无空格。
如果输入的不是数字字符，则提示“输入的字符不是数字字符。”

参考代码fmt.Println("输入的字符不是数字字符。")

输入格式:
输入一个正整数n（n≤35）和一个字符c（数字字符）。

输出格式:
输出数字三角形。

输入样例:
3 9

输出样例:

	 9
	99

999
*/
package main

import (
	"fmt"
)

func main() {
	var n int
	var c string
	fmt.Scan(&n, &c)

	if c[0] < '0' || c[0] > '9' {
		fmt.Println("输入的字符不是数字字符。")
		return
	}

	for i := 0; i < n; i++ {
		for j := 0; j < n-i-1; j++ {
			fmt.Print(" ")
		}
		for k := 0; k < i+1; k++ {
			fmt.Printf("%s", c)
		}
		fmt.Println()
	}
}
