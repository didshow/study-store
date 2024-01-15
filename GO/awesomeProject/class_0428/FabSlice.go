package main

import "fmt"

func main() {
	slice := createSlice(10)
	for index, value := range slice {
		fmt.Println(index, value)
	}
}
func createSlice(n int) []int {
	var slice []int
	for i := 0; i <= n; i++ {
		slice = append(slice, fab(i))
	}
	return slice
}

/*
*
1 1 2 3 5 8 13
*/
func fab(n int) int {
	if n == 1 || n == 2 {
		return 1
	} else {
		return fab(n-1) + fab(n-2)
	}

}
