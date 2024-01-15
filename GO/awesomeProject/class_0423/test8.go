package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	var (
		random int     //随机数
		count  int = 0 //生成随机数的次数
	)
	//种子
	rand.NewSource(time.Now().Unix())
	for {
		count++
		random = rand.Intn(100)
		if random == 99 {
			fmt.Println("random is 99 ,procedure exit!")
			break
		}
		fmt.Println("count is ", count, "random is ", random)
	}
}
