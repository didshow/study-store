/*
首先输入一个正整数T，表示测试数据的组数，然后是T组测试数据。
每组测试数据先输入1个正整数n（1 ≤ n ≤ 100），表示学生总数。
然后输入n行，每行包括1个不含空格的字符串s（不超过8位）和1个正整数d，
分别表示一个学生的学号和解题总数。
输出参考:
fmt.Printf("%-5d%-8s%d\n")

输出格式:
对于每组测试数据，输出最终排名信息，每行一个学生的信息：排名、学号、解题总数。
每行数据之间留一个空格。注意，解题总数相同的学生其排名也相同。

输入样例:
1
4
0010 200
1000 110
0001 200
0100 225

输出样例:
1 0100 225
2 0001 200
2 0010 200
4 1000 110
*/
package main

import (
	"fmt"
	"sort"
)

type Student struct {
	Id    string
	Count int
}

type ByCountThenId []Student

func (a ByCountThenId) Len() int      { return len(a) }
func (a ByCountThenId) Swap(i, j int) { a[i], a[j] = a[j], a[i] }
func (a ByCountThenId) Less(i, j int) bool {
	if a[i].Count == a[j].Count {
		return a[i].Id < a[j].Id
	}
	return a[i].Count > a[j].Count
}

func main() {
	var t int
	fmt.Scan(&t)
	for i := 0; i < t; i++ {
		var n int
		fmt.Scan(&n)
		students := make([]Student, n)
		for j := 0; j < n; j++ {
			fmt.Scan(&students[j].Id, &students[j].Count)
		}
		sort.Sort(ByCountThenId(students))
		for j := 0; j < n; j++ {
			rank := j + 1
			if j > 0 && students[j].Count == students[j-1].Count {
				rank = j
			}
			fmt.Printf("%-5d%-8s%d\n", rank, students[j].Id, students[j].Count)

		}
		fmt.Println()
	}
}
