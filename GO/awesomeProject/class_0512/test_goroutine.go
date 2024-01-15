package main

/**
测试并行
*/
import (
	"fmt"
	"time"
)

// 建立一个信道
var ch chan int = make(chan int)
var complete chan int = make(chan int)

func main() {
	goRoutineTest()
	go full()
	<-ch // 从ch中取数据，如果ch中没有存放数据，main就要挂起，直到fool中存放数据
	go loop1()
	<-complete //直到线程跑完，取到消息则结束；否则main一直处于阻塞
}

// 测试并行
func loop() {
	for i := 0; i < 10; i++ {
		fmt.Printf("%d", i)
	}
	fmt.Println()
}
func goRoutineTest() {
	go loop()
	loop()
	time.Sleep(time.Second)
}
func loop1() {
	for i := 0; i < 10; i++ {
		fmt.Printf("%d", i)
	}
	complete <- 0 // 执行完毕，发个消息
}
func full() {
	ch <- 0 // 向ch写数据
}
