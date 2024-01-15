/*
输入不定长数组
控制台输入不定长整数数组

输入格式:
控制台输入一系列整数，遇到非int类型则返回之前的数组

输出格式:
输入 1 2 3 4 5 a
输出  [1 2 3 4 5]

输入 1 2 3 b 5
输出  [1 2 3]

输入  c 1 2 3 4 5
输出  []

输入样例:
1 2 3 4 5 break

输出样例:
[1 2 3 4 5]
*/
package main

import (
	"fmt"
	"strconv"
)

func main() {
	nums := make([]int, 0)
	var s string
	for {
		n, err := fmt.Scan(&s)
		if n == 0 || err != nil {
			break
		}
		if num, err := strconv.Atoi(s); err == nil {
			nums = append(nums, num)
		} else {
			break
		}
	}
	fmt.Println(nums)
}
