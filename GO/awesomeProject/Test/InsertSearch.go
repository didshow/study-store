/*
*搜索插入位置
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

输入格式:
输入整数数存入数组。第一个数字代表数组长度
最后一个数字代表目标值，可参考下面输入代码

	        var n int
		fmt.Scan(&n)
		nums := make([]int, n)
		for i := 0; i < n; i++ {
			fmt.Scan(&nums[i])
		}
	        fmt.Scan(&target)

nums 为无重复元素 的 升序 排列数组

输出格式:
输出插入位置下标。

输入    4 1 3 5 6 5
输出    2

输入    4 1 3 5 6 7
输出    4

输入样例:
4 1 3 5 6 2

输出样例:
1
*/
package main

import (
	"fmt"
	"sort"
)

func searchInsert(nums []int, target int) int {
	n := len(nums)
	// 特判：如果目标值大于数组中的最后一个元素，则将其插入到最后一个位置
	if target > nums[n-1] {
		return n
	}
	left, right := 0, n-1
	for left < right {
		mid := (left + right) / 2
		if nums[mid] < target {
			left = mid + 1
		} else {
			right = mid
		}
	}
	return left
}

func main() {
	var n, target int
	fmt.Scan(&n)
	nums := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&nums[i])
	}
	sort.Ints(nums)
	fmt.Scan(&target)
	fmt.Println(searchInsert(nums, target))
}
