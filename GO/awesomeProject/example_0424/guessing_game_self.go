package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	// 随机数的最大值
	maxNum := 100
	// 生成随机数的种子
	rand.NewSource(time.Now().Unix())
	// 随机数
	random := rand.Intn(maxNum)
	// 读取用户输入
	var (
		guess int
	)
	for {
		fmt.Print("Please guess your guess : ")
		fmt.Scanf("%d \n", &guess)
		fmt.Println("Your guess is ", guess)
		switch {
		case guess > random:
			fmt.Println("Your guess is bigger than random, Please try again")
		case guess < random:
			fmt.Println("Your guess is smaller than random, Please try again")
		case guess == random:
			fmt.Println("Correct! You success!")
			break
		default:
			fmt.Println("Error input, Please try again")
		}
	}
}
