package main

import "fmt"

func main() {
	var array = []int{2, 3, 0, 54, 96, 36, 78, 52}
	var array1 = []int{2, 3, 0, 54, 96, 36, 78, 52}
	fmt.Println("The array is ")
	fmt.Println(array)
	selectSort(array)
	fmt.Println("--- selectSort array is ---", array)
	bubbleSort(array1)
	fmt.Println("--- bubbleSort array is ---", array1)
}
func selectSort(array []int) {
	for i := 0; i < len(array); i++ {
		for j := i + 1; j < len(array); j++ {
			if array[i] > array[j] {
				temp := array[i]
				array[i] = array[j]
				array[j] = temp
			}
		}
	}
}
func bubbleSort(array []int) {
	for i := 0; i < len(array); i++ {
		for j := 0; j < len(array)-i-1; j++ {
			if array[j] > array[j+1] {
				tmp := array[j]
				array[j] = array[j+1]
				array[j+1] = tmp
			}
		}
	}
}
