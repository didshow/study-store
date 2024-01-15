package main

import "fmt"

func ToUpper(str string) string {
	upperStr := ""
	for _, char := range str {
		if char >= 'a' && char <= 'z' {
			upperChar := char - 32
			upperStr += string(upperChar)
		} else {
			upperStr += string(char)
		}
	}
	return upperStr
}

func ToLower(str string) string {
	lowerStr := ""
	for _, char := range str {
		if char >= 'A' && char <= 'Z' {
			lowerChar := char + 32
			lowerStr += string(lowerChar)
		} else {
			lowerStr += string(char)
		}
	}
	return lowerStr
}

func main() {
	var str string
	fmt.Scanf("%s", &str)
	fmt.Printf("%s %s", ToUpper(str), ToLower(str))
}
