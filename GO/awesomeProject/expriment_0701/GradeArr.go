/*
*
一维数组生活应用
go语言期末考试有6个学生成绩存入一维数组中，
请输出所有及格的学生成绩，并统计及格人数。

输入格式:
输入6个【0-100】之间的整数作为学生成绩，中间以空格隔开。

输出格式:
按顺序以每个数据占据5列的形式输出及格的成绩，另起一行输出及格人数。

输入样例:
90 88 78 97 56 54

输出样例:
90   88   78   97
4
*/
package main

import (
	"fmt"
)

func Count(grade []int) (int, []int) {
	n := len(grade)
	res := make([]int, 0)
	for i := 0; i < n; i++ {
		if grade[i] >= 60 {
			res = append(res, grade[i])
		}
	}
	count := len(res)
	return count, res
}
func main() {
	grade := make([]int, 6)
	for i := 0; i < 6; i++ {
		fmt.Scan(&grade[i])
	}
	count, res := Count(grade)
	for i := 0; i < len(res); i++ {

		if i == len(res)-1 {
			fmt.Printf("%-5d\n", res[i])
		} else {
			fmt.Printf("%-5d", res[i])
		}
	}
	fmt.Println(count)
}
