package main

import "fmt"

func main() {
	var a [3]int
	for i := 0; i < 3; i++ {
		a[i] = 0
		fmt.Println(a)
	}
	var numArray = [4]int{5, 6, 7, 8}
	fmt.Println(numArray)
	var cityArray = [...]string{"北京", "上海", "成都"}
	fmt.Println(cityArray)
	b := []int{1: 1, 3: 5}
	fmt.Println(b)
	fmt.Println("The type is:", a)
	// for range 遍历
	for index, value := range a {
		fmt.Println(index, value)
	}
	for index, value := range cityArray {
		fmt.Println("the index is ", index, ",the value is ", value)
	}
}
