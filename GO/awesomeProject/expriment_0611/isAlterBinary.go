/*
交替二进制数
给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：
换句话说，就是二进制表示中相邻两位的数字永不相同。

输入格式:
输入大于等于1的数

输出格式:
true or false

输入样例:
11

输出样例:
false
*/
package main

import (
	"fmt"
	"strconv"
)

func isBinaryAlter(n int) bool {
	binary := strconv.FormatInt(int64(n), 2)
	for i := 1; i < len(binary); i++ {
		if (binary[i] == '0' && binary[i-1] == '0') || (binary[i] == '1' && binary[i-1] == '1') {
			return false
		}
	}
	return true
}
func main() {
	var n int
	fmt.Scanf("%d", &n)
	result := isBinaryAlter(n)
	fmt.Println(result)
}
