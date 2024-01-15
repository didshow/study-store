/*
翻转字符串
将字符串反转

输入格式:
输入一行字符串，不包含空格

输出格式:
输出该字符串的反转

输入样例:
abc

输出样例:
cba
*/
package main

import "fmt"

func main() {
	var str string

	fmt.Scanf("%s", &str)
	r := []rune(str)
	// 翻转rune切片中的元素
	for i, j := 0, len(r)-1; i < j; i, j = i+1, j-1 {
		r[i], r[j] = r[j], r[i]
	}

	// 将rune切片转换为字符串并输出
	fmt.Println(string(r))
}
