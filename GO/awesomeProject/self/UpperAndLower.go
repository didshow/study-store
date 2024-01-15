package main

import (
	"fmt"
	"strings"
)

func ToUpperAndLower(str string) (string, string) {
	upperStr := strings.ToUpper(str)
	lowerStr := strings.ToLower(str)
	return upperStr, lowerStr
}
func main() {
	var str string
	fmt.Scan(&str)
	upperStr, lowerStr := ToUpperAndLower(str)
	fmt.Printf("%s %s", upperStr, lowerStr)
}
