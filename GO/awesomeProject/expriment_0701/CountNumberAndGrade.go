/*
统计学生总成绩和优秀人数
本题要求编写程序，计算学生们的意成绩，并统计优秀（成绩在90分以上）的人数。题目保证输入与输出均在整型范围内。

输入格式:
输入在第一行中给出非负整数N，即学生人数。
第二行给出N个非负整数，即这N位学生的成绩，其间以空格分隔。

输出格式:
sum=总成绩
count=优秀人数

输入样例:
5
77 54 92 73 100

输出样例:
sum=396
count=2
*/
package main

import (
	"fmt"
)

func GradeSumAndNumber(nums []int) (int, int) {
	sum := 0
	count := 0
	n := len(nums)
	for i := 0; i < n; i++ {
		if nums[i] >= 90 {
			count++
		}
		sum += nums[i]
	}
	return sum, count
}
func main() {
	var n int
	fmt.Scan(&n)
	grade := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&grade[i])
	}
	sum, count := GradeSumAndNumber(grade)
	fmt.Printf("sum=%d\n", sum)
	fmt.Printf("count=%d\n", count)
}
