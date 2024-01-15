package main

import (
	"fmt"
)

func maxArr(nums []int) []int {
	res := make([]int, 0)
	n := len(nums)
	start := 0
	maxStart := 0
	length := 1
	maxLength := 1
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
	if length > maxStart {
		maxStart = start
		maxLength = length
	}
	for i := maxStart; i < start+maxLength; i++ {
		res = append(res, nums[i])
	}
	return res
}
func main() {
	var n int
	fmt.Scan(&n)
	nums := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&nums[i])
	}
	res := maxArr(nums)
	for i := 0; i < len(res); i++ {
		fmt.Printf("%d ", res[i])
	}
}
