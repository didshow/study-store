package main

import (
	"errors"
	"fmt"
)

/**
> 函数语法
	func name(param) returns{
		body
	}
其中，参数由参数变量和参数类型（可变参数、固定参数）组成，可以返回多个值
返回值补充 nil === null === 0
局部变量：*函数内部的变量无法在函数外使用，如果局部变量和全局变量重名，优先访问局部变量
> type：定义函数类型
> 高阶函数：函数作为参数
> 匿名函数和闭包：函数内部不能定义函数，要定义函数只能定义匿名函数（没有名字的函数），只能将匿名函数保存到变量里；或者自执行函数；
主要用于定义闭包：一个函数可以访问其外部作用域中定义的变量，即使这些变量在函数被调用时已经不存在了。（一个函数和一个函数外的变量的封装）
执行完毕之后不会清除，相当于一个静态变量；和回调

*/

func main() {
	op := sum
	result := calc(5, 6, op)
	fmt.Println(result)
	// 如果x没有赋参数，则返回一个地址
	x, err := returnsFunc("+")
	fmt.Println(x(3, 4), err)
}

/*
*
求和
*/
func sum(x, y int) int {
	return x + y
}
func sub(x, y int) int {
	return x - y
}

/*
*
函数作为参数
*/
func calc(x, y int, op func(int, int) int) int {
	return op(x, y)
}

/*
*
函数作为返回值
*/
func returnsFunc(s string) (func(int, int) int, error) {
	switch s {
	case "+":
		return sum, nil
	case "-":
		return sub, nil
	default:
		err := errors.New("无法识别的操作符")
		return nil, err
	}
}

/*
*
斐波拉契数列
*/
func Fab(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	return Fab(n) + Fab(n-1)
}

/*
*
可变参数：x...int
*/
func paramNum(x ...int) int {
	sum := 0
	for _, v := range x {
		sum += v
	}
	return sum
}

/*
*
返回多个参数
*/
func sumAndSub(x, y int) (sum, sub int) {
	sum = x + y
	sub = x - y
	return sum, sub
}

/**
定义函数类型使用
*/
//type calculation func(x,y int) int {
//	return x+y
//}
/**
重点：闭包
*/
func adder() func(int) int {
	var x int
	// 匿名函数
	return func(y int) int {
		x += y
		return x
	}
}
