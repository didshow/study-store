package main

import "fmt"

/*
*
最大公约数
*/
func main() {
	var (
		x int
		y int
	)
	fmt.Println("请输入x，y：（int）")
	fmt.Scanf("%d %d \n", &x, &y)

	fmt.Println("gcd--x与y的最大公约数为：", gcd(x, y))
	fmt.Println("gcdNormal--x,y的最大公约数为：", gcdNormal(x, y))
	fmt.Println("gcdCircle--x与y的最大公约数为：", gcdCircle(x, y))
}

// 非递归写法
func gcd(x, y int) int {
	var (
		tmp int
	)
	for {
		tmp = (x % y)
		if tmp > 0 {
			x = y
			y = tmp
		} else {
			return y
		}
	}
}

// 穷举法
func gcdNormal(x, y int) int {
	var (
		n int
	)
	if x > y {
		n = x
	} else {
		n = y
	}
	for i := n; i > 0; i-- {
		if x%i == 0 && y%i == 0 {
			return i
		}
	}
	return 1
}

// 递归写法
func gcdCircle(x, y int) int {
	tmp := x % y
	if tmp > 0 {
		return gcd(y, tmp)
	} else {
		return y
	}
}
