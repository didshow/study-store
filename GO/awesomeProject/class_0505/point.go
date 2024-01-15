package main

import "fmt"

/*
*
指针地址、指针类型、指针取值
为了保存一个变量的地址。==引入指针变量
声明方法：var a *int
&:取地址
*:根据地址取值
go语言中的值类型：int float string bool array struct
取地址中的内容：*b
*b和a的地址相同
*/
func main() {
	//test1()
	a := 20
	update1(a)
	fmt.Println("first a is ", a)
	update2(&a)
	fmt.Printf("second a is %d", a)

}
func test1() {
	a := 10
	b := &a
	c := *b

	fmt.Printf("a: %d", a)
	fmt.Println("\nb is ", *b)
	fmt.Printf("b:%p \nThe type of b is :%T", b, b)
	fmt.Printf("\nb: value is %d", *b)
	fmt.Printf("\nc type is %T", c)
	fmt.Printf("\nc value is %v", c)
}

/*
*
函数的参数传递
> 值传递
> 址传递
*/
func update1(x int) {
	x = 100
}
func update2(x *int) {
	*x = 200
}
