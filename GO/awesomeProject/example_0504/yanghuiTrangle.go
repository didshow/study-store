package main

import "fmt"

func main() {
	nums := []int{}
	var i int
	for i = 0; i < 10; i++ {
		nums = print(nums)
		fmt.Println(nums)
	}
}
func print(inArr []int) []int {
	var (
		out    []int
		i      int
		arrlen = len(inArr)
	)
	out = append(out, 1)
	if arrlen == 0 {
		return out
	}
	for i = 0; i < arrlen-1; i++ {
		out = append(out, inArr[i]+inArr[i+1])
	}
	out = append(out, 1)
	return out
}
