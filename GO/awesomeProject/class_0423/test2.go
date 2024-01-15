package main

import "fmt"

func main() {
	var (
		grade int
	)
	fmt.Scanf("%d \n", &grade)
	if grade < 0 || grade > 100 {
		fmt.Println("错误输入")
	} else {
		if grade == 100 {
			fmt.Println("奖励一辆BWM")
		} else if grade > 80 && grade <= 90 {
			fmt.Println("奖励一台iphone7plus")
		} else if grade > 60 && grade <= 80 {
			fmt.Println("奖励一个ipad")
		} else {
			fmt.Println("奖励一个大嘴巴子")
		}
	}
}
