/*
数字排序
输入一串整数，以空格为分割，以-1为结束,输出他们排序后的结果

输入格式:
输入一串整数，以空格为分割，以-1为结束。

输出格式:
这些数字排序后的结果,每个数字以空格相隔，
用"[","]"包裹，若无数字则输出"[]"

输入样例:
1 13 9 -1

输出样例:
[1 9 13]
*/
package main

import (
	"fmt"
	"sort"
)

func main() {
	var num int
	var a []int
	for {
		fmt.Scan(&num)
		if num == -1 {
			break
		}
		a = append(a, num)
	}
	sort.Ints(a)
	fmt.Print("[")
	for i := 0; i < len(a); i++ {
		if i != len(a)-1 {
			fmt.Printf("%d ", a[i])
		} else {
			fmt.Printf("%d", a[i])
		}
	}
	fmt.Println("]")
}
