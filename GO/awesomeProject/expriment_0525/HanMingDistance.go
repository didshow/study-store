/*
汉明距离
两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。

给你两个整数 x 和 y，计算并返回它们之间的汉明距离。

输入：x = 1, y = 4
输出：2
解释：
1   (0 0 0 1)
4   (0 1 0 0)

	↑   ↑

上面的箭头指出了对应二进制位不同的位置。

输入格式:
大于等于0的两个数

输出格式:
输出有多少个不同位置的数目

输入样例:
3 1

输出样例:
1
*/
package main

import (
	"fmt"
)

func hammingDistance(x int, y int) int {
	z := x ^ y
	distance := 0
	for z > 0 {
		if z&1 == 1 {
			distance++
		}
		z >>= 1
	}
	return distance
}

func main() {
	var x, y int
	fmt.Scan(&x, &y)
	fmt.Println(hammingDistance(x, y))
}
