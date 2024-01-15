package main

import (
	"fmt"
)

type Stu struct {
	Id    string
	Count int
}

func Sort(students []Stu) {
	Len := len(students)
	for i := 0; i < Len; i++ {
		for j := i + 1; j < Len; j++ {
			if students[i].Count < students[j].Count {
				tmp := students[i]
				students[i] = students[j]
				students[j] = tmp
			}
		}
	}
}
func main() {
	var t int
	fmt.Scan(&t)
	for i := 0; i < t; i++ {
		var n int
		fmt.Scan(&n)
		students := make([]Stu, n)
		for j := 0; j < n; j++ {
			fmt.Scan(&students[j].Id, &students[j].Count)
		}
		Sort(students)
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
