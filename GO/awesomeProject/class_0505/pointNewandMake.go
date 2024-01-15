package main

import "fmt"

/*
*
new：分配值类型
定义指针必须分配内存空间，如果不分配称为野指针
*/
func main() {
	//newTest()
	//var a *int
	//a = new(int)
	//*a = 10
	//fmt.Println(a)
	var array [3]string = [3]string{"fzd", "lyc", "zyq"}
	fmt.Println(array)
	ex(&array)
	fmt.Println(array)
	makeTest()
}
func newTest() {
	a := new(int)
	b := new(bool)
	fmt.Println(*a)
	fmt.Println(*b)
}

/*
*
make (type,len,cap)
type:类型 len:长度 cap:容量
*/
func makeTest() {
	var s = make([]int, 6, 6)
	fmt.Println(s)
}
func ex(array *[3]string) {
	array[0] = "lzx"
}
