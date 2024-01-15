package main

import "fmt"

/*
	学生通讯录的增删改查
	> 结构体：常规使用；

通过结构体实现面向对象，方法、接口：根据博客进行学习

		> 数组：存储同一类型的数据 结构体：不同类型的数据
		> 定义结构体 ：type struct_type struct{
						member1 type
						...
						membern type
	}

	> 声明变量
	var name_type type
	> 结构体指针： var struct_pointer *struct_type
	struct_pointer = &book1
	结构体指针作为函数参数，实现printBook2
*/
type Books struct {
	title   string
	author  string
	book_id int
}

func main() {
	testStruct()
}
func testStruct() {
	// 定义变量方法赋值
	var book1 Books
	var book2 Books

	book1.title = "Java"
	book1.author = "yy"
	book2.book_id = 1

	// 打印book1
	fmt.Println("----- 手动打印book1 ------")
	fmt.Println("book1 title is ", book1.title)
	fmt.Println("book1 author is ", book1.book_id)
	fmt.Println(book1)

	// 定义函数
	println("----- function打印book1以及相关地址 -----")
	printBook(book1)
	printBook2(&book1)

	fmt.Println("----- 手动打印book1相关地址 ------")
	// %p 打印的是地址类型的
	fmt.Printf("book1 title address is %p \n", &book1.title)
	fmt.Printf("book1 author address is %p \n", &book1.author)
	fmt.Printf("book1 book_id address is %p \n", &book1.book_id)
	fmt.Printf("book1 address is %p \n", &book1)

	// 通过Books结构体赋值
	fmt.Println("----- 结构体赋值打印 -----")
	fmt.Println(Books{title: "go语言", author: "jack", book_id: 11})
	fmt.Println(Books{})
	fmt.Println(Books{title: "操作系统"})
}
func printBook(book Books) {
	fmt.Printf("book title is %s \n", book.title)
	fmt.Printf("book author is %s \n", book.author)
	fmt.Printf("book book_id is %d \n", book.book_id)
}

// 结构体指针
func printBook2(book *Books) {
	fmt.Printf("book address is %p \n", book)
	fmt.Printf("book title is %s \n", book.title)
	fmt.Printf("book author is %s \n", book.author)
	fmt.Printf("book book_id is %d \n", book.book_id)
}
