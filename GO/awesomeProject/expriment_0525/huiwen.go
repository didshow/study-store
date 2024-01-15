/*
回文数
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。

著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

输入格式:
大于-2^32 小于 2^32-1

输出格式:
true or false

输入样例:
-121

输出样例:
false
*/
package main

import "fmt"

func main() {
	var a int
	fmt.Scanf("%d", &a)
	r := isP(a)
	fmt.Println(r)
}
func isP(a int) bool {
	if a < 0 {
		return false
	}
	if a < 10 {
		return true
	}
	if a%10 == 0 {
		return false
	}
	y := 0
	for a > y {
		// 取最后一位和第一位比较
		y = y*10 + a%10
		a /= 10
	}
	return a == y || a == y/10
}
