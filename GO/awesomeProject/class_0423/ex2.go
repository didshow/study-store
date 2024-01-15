package main

import "fmt"

/*
*
最小公倍数
*/
func main() {
	var (
		x int
		y int
	)
	fmt.Println("请输入x,y的值：（int）")
	fmt.Scanf("%d %d \n", &x, &y)
	fmt.Println("lcm--x,y的最小公倍数为：", lcm(x, y))
	fmt.Println("lcmNormal--x,y的最小公倍数为：", lcmNormal(x, y))
}

// 穷举法
func lcmNormal(x, y int) int {
	var res int = x * y
	var i int = x
	if y > x {
		i = y
	}
	for ; i <= res; i++ {
		if i%x == 0 && i%y == 0 {
			return i
		}
	}
	return res
}

// 公式法：最小公倍数=x*y/最大公约数
func lcm(x, y int) int {
	return x * y / gcd1(x, y)
}

// 非递归写法
func gcd1(x, y int) int {
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
