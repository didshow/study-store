package main

import (
	"fmt"
	"strconv"
)

func isAlterBinary(n int) bool {
	binary := strconv.FormatInt(int64(n), 2)
	for i := 0; i < len(binary); i++ {
		if (binary[i] == '0' && binary[i-1] == '0') || (binary[i] == '1' && binary[i-1] == '1') {
			return false
		}
	}
	return true
}
func main() {
	var n int
	fmt.Scan(&n)
	fmt.Println(isAlterBinary(n))
}
