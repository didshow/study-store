package main

import "fmt"

func main() {
	var a = [...]int{6, 5, 8, 9, 7, 9}
	var tmp int = 0

	for i := 0; i < len(a)/2+1; i++ {

		tmp = a[i]
		a[i] = a[len(a)-i-1]
		a[len(a)-i-1] = tmp
	}
	fmt.Println(a)
}
