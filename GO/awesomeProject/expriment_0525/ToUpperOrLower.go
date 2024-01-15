/*
字符串变化大小写
将字符串变化大小写并输出

输入格式:
输入一行字符串，长度无上限，中间无空格

输出格式:
输出为一行，先将字符串转换为大写，再将字符串转化成小写，中间用空格隔开

输入样例:
CuitCBIYes!

输出样例:
CUITCBIYES! cuitcbiyes!
*/
package main

import (
	"fmt"
	"strings"
)

func main() {
	var str string
	fmt.Scanf("%s", &str)
	strUpper := strings.ToUpper(str)
	strLower := strings.ToLower(str)
	fmt.Printf("%s %s", strUpper, strLower)
}
