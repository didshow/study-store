package main

import "fmt"

// 二分查找法

func main() {
	arr := []int{1, 7, 8, 9, 21, 36, 54, 60, 69, 70}

	result := BinarySearch(arr, 21)
	fmt.Println("The result index is ", result)
}
func BinarySearch(arr []int, key int) int {
	var (
		left  int = 0
		right int = len(arr) - 1
	)
	for left <= right {
		middle := (left + right) / 2
		if arr[middle] > key {
			left = middle + 1
		} else if arr[middle] < key {
			right = middle - 1
		} else {
			return middle
		}
	}
	return -1
}
func BubbleSort1(arr []int) {
	for i := 0; i < len(arr); i++ {
		for j := 0; j < len(arr)-i-1; j++ {
			if arr[j] > arr[j+1] {
				tmp := arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = tmp
			}
		}
	}
}
