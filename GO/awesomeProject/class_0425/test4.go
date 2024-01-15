package main

import (
	"fmt"
)

func main() {
	var a = [...]int{6, 5, 8, 9, 7, 9}
	var tmp int = 0
	var j int = int(len(a)) - 1
	if j%2 == 0 {
		for i := 0; i < len(a); i++ {
			if i == j {
				break
			}
			tmp = a[j]
			a[j] = a[i]
			a[i] = tmp
			j--
		}
	} else {
		for i := 0; i < len(a); i++ {
			if i < j {
				tmp = a[j]
				a[j] = a[i]
				a[i] = tmp
			}
			j--
		}
	}
	fmt.Println(a)
}
