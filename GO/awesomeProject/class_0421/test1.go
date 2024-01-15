package main

import "fmt"

// var (
//
//	str string  = "abaaddgga"
//	A   uint8   = 1
//	d   float32 = 1.2
//	e   float64 = 1.5464651561
//	a   int     = 100
//	b   int     = 2400
//	c   int     = 400
//
// )
// var (
//
//	f1   float32 = 5.1
//	f2   float32 = 3.5
//	f3   float32 = 4.44
//	area float32
//
// )
// var (
//
//	by byte = 'a'
//
// )
// 定义两个整形
var (
	a  int
	b  int
	f1 float32
	f2 float32
	s1 string
	s2 string
	b1 bool
	b2 bool
	c  int     = a * b
	f  float32 = f1 / f2
	s  string  = s1 + s2
	b3 bool    = b1 && b2
)

func main() {
	fmt.Println("Please input a,b")
	fmt.Scanf("%d %d", &a, &b)
	fmt.Println(c)

	fmt.Println("Please input f1,f2")
	fmt.Scanf("%f %f", &f1, &f2)
	fmt.Println(f)

	fmt.Println("Please input s1,s2")
	fmt.Scanf("%s %s", &s1, &s2)
	fmt.Println(s)

	fmt.Println("Please input b1,b2")
	fmt.Scanf("%t %t", &b1, &b2)
	fmt.Println(b3)
	//fmt.Printf("%d \n", a)
	//fmt.Printf("%o \n", a)
	//fmt.Printf("%d %b \n", a, b)
	//fmt.Printf("%x %X \n", a, a)
	//fmt.Printf("%f \n", math.Pi)
	//fmt.Printf("%.2f \n", math.Pi)
	//fmt.Println("D:\\wechat\\test_struct.go")
	//fmt.Printf("D:\\wechat\\test_struct.go\n")
	//fmt.Print(a, b, c, d)
	//fmt.Printf("%c \n", by)
	//var (
	//	a int
	//	b float32
	//	c string
	//	d bool
	//)
	//fmt.Println("Please input a(int),b(float32),c(string),d(bool)")
	//fmt.Scanf("%d %f %s %t", &a, &b, &c, &d)
	//fmt.Printf("%d %f %s %t\n", a, b, c, d)
	//fmt.Scanln(&a, &b, &c, &d)
	//fmt.Print(a, b, c, d)
}
