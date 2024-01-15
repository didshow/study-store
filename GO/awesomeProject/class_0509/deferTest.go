package main

import "fmt"

/*
*
defer：defer：将对其后面跟随的语句进行延迟处理。在defer归属的函数即将返回时，将延迟处理的语句按defer定义的逆序执行；相当于栈
由于defer语句延迟调用的特性，所以defer语句可以用于资源关闭；不是原子操作，分为返回值赋值和RET指令两步，
*/
func main() {
	result := testDefer2()
	println(result)
	x := 1
	y := 2
	defer calcu("AA", x, calcu("A", x, y))
	x = 10
	defer calcu("BB", y, calcu("B", x, y))
	y = 20
}

// defer func()之前，x已经return了
func testDefer1() int {
	x := 5
	defer func() {
		x++
	}()
	return x
} //5
// 返回值是5，之后在defer再将
func testDefer2() (x int) {
	defer func() {
		x++
	}()
	return 5
} //6
func testDefer3() (y int) {
	x := 5
	defer func() {
		x++
	}()
	return x
} //5
func testDefer4() (x int) {
	defer func(x int) {
		x++
	}(x)
	return 5
} //5
/*
*
defer面试题
*/
func calcu(index string, a, b int) int {
	ret := a + b
	fmt.Println(index, a, b, ret)
	return ret
}
