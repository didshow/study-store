package main

import "fmt"

func main() {
	arr := []int{1, 7, 9, 8, 60, 70, 54, 21, 36, 69}
	BubbleSort(arr)
	fmt.Println("The sort array is ", arr)
}
func BubbleSort(arr []int) {
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
