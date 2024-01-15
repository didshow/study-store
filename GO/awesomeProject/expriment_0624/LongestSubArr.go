/*
最长连续递增子数组
给定一个顺序存储的线性表，请设计一个算法查找该线性表中最长的连续递增子序列。
例如，(1,9,2,5,7,3,,6,8,0)中最长的递增子序列为(3,4.6.8).

输入格式:
输入第1行给出正整数n (< 105) ，第2行给出n个整数，其间以空格分隔输出格式:

输出格式:
在一行中输出第一次出现的最长连续递增子序列，数字之间用空格分隔，序列结尾不能有多余空格

输入样例:
15
1 9 2 5 7 3 4 6 8 0 11 15 17 17 10

输出样例:
3 4 6 8
*/
package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)

	nums := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&nums[i])
	}

	start, length := 0, 1       // 当前递增子序列的起始位置和长度
	maxStart, maxLength := 0, 1 // 最长子序列的起始位置和长度

	for i := 1; i < n; i++ {
		if nums[i] > nums[i-1] {
			length++
		} else {
			if length > maxLength {
				maxLength = length
				maxStart = start
			}
			start = i
			length = 1
		}
	}
	if length > maxLength { // 处理最后一个递增子序列
		maxLength = length
		maxStart = start
	}

	for i := maxStart; i < maxStart+maxLength; i++ {
		fmt.Printf("%d ", nums[i])
	}
}
