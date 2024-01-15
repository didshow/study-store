package main

import "fmt"

func main() {
	//test()
	//makeTest()
	//test1()
	//testAppend()
	testCopy1()
	var slice []int = []int{1, 2, 3, 4, 5}
	testParam(slice)
	fmt.Println("--- After function slice is: ", slice)
}

/*
*
切片是对数组的引用，切片中值改变，数组中值也改变。理解为：

	type slice struct {
		ptr *[2] int
		len int
		cap int	//cap 是 len 的两倍
	}
*/
func test() {
	var intArr [5]int = [5]int{1, 2, 3, 4, 5}
	slice := intArr[1:3]
	fmt.Println("The slice is ", slice)
	fmt.Println("The slice is ", slice[0])
	fmt.Println("The len od slice is ", len(slice))
	fmt.Println("The cap of slice is ", cap(slice))
}

/*
*
 */
func makeTest() {
	var slice []int = make([]int, 2, 4)
	fmt.Println("Initial slice is ", slice)
	slice[0] = 1
	slice[1] = 2
	fmt.Println("Current slice is ", slice)
}

/*
*
array[0] slice1[0] slice2[0] 指向一个地址
*/
func test1() {
	var array [3]int = [3]int{1, 2, 3}
	array[0] = 9
	slice1 := array[:2]
	slice2 := array[:1]
	fmt.Printf("The address of array[0] array[1] array[2]"+" is %p, %p and %p\n", &array[0], &array[1], &array[2])
	fmt.Printf("The address of slice1[0] slice1[1]"+" is %p, %p\n", &slice1[0], &slice1[1])
	fmt.Printf("The address of slice2[0]"+" is %p\n", &slice2[0])
	fmt.Println("array[0]: ", array[0])
	fmt.Println("slice1[0]: ", slice1[0])
}

/*
*
对切片append就是对数组扩容，go创建一个新的数组，安装扩容后的大小，然后将slice原来引用的数组拷贝到新的数组，将左边的切片引用到新的数组
*/
func testAppend() {
	var array []int = []int{1, 2, 3}
	silce1 := append(array, 4, 5, 6, 7, 8)
	fmt.Println("The append result is: ", silce1)
	slice2 := silce1[1:3]
	slice3 := silce1[4:]
	var slice4 []int
	for i := 0; i < len(slice3); i++ {
		slice4 = append(slice2, slice3[i])
	}
	fmt.Println("The append result is ", slice4)
}

/*
*
copy()
*/
func testCopy() {
	var slice1 []int = []int{1, 2, 3, 4, 5}
	var slice2 []int = make([]int, 10)
	fmt.Println("the value of slice2:", slice2)
	copy(slice1, slice2)
	fmt.Println("--- After copy ---")
	fmt.Println("the value of slice2:", slice2)
	fmt.Println("the value of slice1:", slice1)
}
func testCopy1() {
	var slice1 []int = []int{1, 2, 3, 4, 5}
	var slice2 []int = make([]int, 3)
	fmt.Println("the value of slice1:", slice1)
	copy(slice1, slice2)
	fmt.Println("--- After copy ---")
	fmt.Println("the value of slice1:", slice1)
	fmt.Println("the value of slice2:", slice2)
}
func testParam(slice []int) {
	slice[0] = 100
	fmt.Println("-- In function slice is: ", slice)
}
