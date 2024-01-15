/*
两数之和
给定一个整数数组 nums 和一个整数目标值 target，
请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标

输入格式:
第一个数字代表切片长度，最后一个数字代表target。
例如nums = [2, 7, 11, 19]，target = 9的输入输出样例如下图所示

输出格式:
用数组存储满足条件的两个数字在数组中的下标。若无满足条件则输出[]

输入样例:
4 2 7 11 19 9

输出样例:
[0 1]
*/
package main

import "fmt"

func SumNum(n int, arr []int, target int) (index1, index2 int) {
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if i != j && arr[i]+arr[j] == target {
				return i, j
			}
		}
	}
	return -1, -1
}
func main() {
	var n int
	fmt.Scanf("%d", &n)
	arr := make([]int, n)
	for i := 0; i < len(arr); i++ {
		fmt.Scan(&arr[i])
	}
	var target int
	fmt.Scanf("%d", &target)
	index1, index2 := SumNum(n, arr, target)
	if index1 != -1 {
		fmt.Printf("[%d %d]", index1, index2)
	} else {
		fmt.Println("[]")
	}
}
