/*
判断n个年份是不是闰年
输入多个年份，判断是不是闰年（能够被400整除，或能被4整除，但不能被100整除）

输入格式:
先输入n，表示多少个年份，接着每行一个输入多个年份

输出格式:
每行输出对应年份是不是闰年，是则输入Yes，否则输出No

输入样例:
3
2060
2020
1994

输出样例:
Yes
Yes
No
*/
package main

import (
	"fmt"
)

func isRun(year int) bool {
	if year%400 == 0 || (year%100 != 0 && year%4 == 0) {
		return true
	}
	return false
}
func main() {

	var n int
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		var year int
		fmt.Scan(&year)
		if isRun(year) {
			fmt.Println("Yes")
		} else {
			fmt.Println("No")
		}
	}
}
