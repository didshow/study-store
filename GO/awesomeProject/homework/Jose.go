package main

import "fmt"

func main() {
	var n, k, m int

	_, err := fmt.Scan(&n, &k, &m)
	if err != nil {
		fmt.Print("Invalid input")
	}
	printRes(Joseph(n, k, m))

}

func Joseph(n, k, m int) []int {
	var res []int
	people := make([]int, n)
	for i := 0; i < n; i++ {
		people[i] = i + 1
	}
	//startIndex := k-2
	k = -1
	startIndex := k
	for j := n; j > 0; j-- {
		outIndex := (startIndex + m) % j
		res = append(res, people[outIndex])
		//更新删除出圈人之后的people
		people = append(people[:outIndex], people[outIndex+1:]...)
		startIndex = outIndex - 1
	}
	return res
}
func printRes(a []int) {
	for i := 0; i < len(a); i++ {
		fmt.Print(a[i])
		fmt.Print(" ")
	}
}
