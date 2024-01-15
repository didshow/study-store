/*
最大子数组和
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组
（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。

输入格式:
第一行为子数组的长度
后续输入子数组每一项的值

输出格式:
输出最大和

输入样例:
9
-2 1 -3 4 -1 2 1 -5 4

输出样例:
6
*/
package main

import "fmt"

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}
func maxSubArray(nums []int) int {
	n := len(nums)
	if n == 0 {
		return 0
	} else {
		dp := make([]int, n)
		dp[0] = nums[0]
		maxSum := nums[0]
		for i := 1; i < n; i++ {
			dp[i] = max(nums[i], dp[i-1]+nums[i])
			maxSum = max(maxSum, dp[i])
		}
		return maxSum
	}
}
func main() {
	var (
		num int
		n   int
	)
	fmt.Scanln(&n)
	nums := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&num)
		nums = append(nums, num)
	}
	fmt.Println(maxSubArray(nums))
}
