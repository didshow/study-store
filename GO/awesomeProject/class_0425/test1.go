package main

import "fmt"

func main() {
	demoSwitch()
	testSwitch()
}

func demoSwitch() {
	var n int
	fmt.Println("Please input n ")
	fmt.Scanf("%d \n", &n)
	switch n {
	case 1, 3, 5, 7, 9:
		fmt.Println("奇数")
		fallthrough
	case 0, 2, 4, 6, 8:
		fmt.Println("偶数")
	default:
		fmt.Println("Error")
	}
}
func testSwitch() {
	var age int
	fmt.Println("Please input your age: ")
	fmt.Scanf("%d \n", &age)
	switch {
	case age <= 25:
		fmt.Println("good good study")
	case age >= 60:
		fmt.Println("enjoy your life")
	case age > 25 && age < 60:
		fmt.Println("good good work")
	default:
		fmt.Println("error")
	}
}
func testGrade() {
	fmt.Println("Please intput your grade: ")
	var grade int
	switch {
	case grade > 90:
		fmt.Println("good")
	case grade < 60 && grade >= 0:
		fmt.Println("bad")
	case grade >= 60 && grade <= 90:
		fmt.Println("normal")
	default:
		fmt.Println("error")
	}
}
