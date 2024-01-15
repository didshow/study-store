package main

import (
	"bufio"
	"fmt"
	"math/rand"
	"os"
	"strconv"
	"strings"
	"time"
)

/*
*
生成一个随机数，让用户猜数字，猜错则提醒用户，猜测大了或者猜测小了；
直到用户猜对数字为止，练习bufio
*/
func main() {
	// 设置随机数最大值
	maxNum := 100

	// 随机数种子(如果没有会增加随机数相同的概率)
	rand.NewSource(time.Now().Unix())

	// 生成随机数
	secretNumber := rand.Intn(maxNum)
	fmt.Println("The secret number is ", secretNumber)
	for {
		// 读取用户输入
		fmt.Print("Please input your guess: ")
		reader := bufio.NewReader(os.Stdin) // os.Stdin 是标准输入文件/dev/stdin的指针

		// 读取一行输入，按下回车表示输入结束
		input, err := reader.ReadString('\n')

		// nil 是归零的意思,当err != 0时,表示程序出现了错误,我们就需要对其进行异常处理
		if err != nil {
			fmt.Println("An error occured while reading input, Please try again", err)
			break
		}

		// 去掉换行符,TrimSuffix(s,suffix string) 方法返回字符串，目的是去掉尾部的指定字符(串)即：suffix
		input = strings.TrimSuffix(input, "\n")

		// 将string类型的input转换为int类型,Atoi(string to int),Itoa(int to string)
		guess, err1 := strconv.Atoi(input)
		if err1 != nil {
			fmt.Println("Invalid input, Please enter an integer value")
			break
		}
		fmt.Println("Your guess is ", guess)
		// 判断用户输入值是否为随机数，是则提醒成功，否则提醒重新猜测
		if guess > secretNumber {
			fmt.Println("Your guess is bigger than secret number, Please try again")
		} else if guess < secretNumber {
			fmt.Println("Your guess is smaller than secret number, Please try again")
		} else {
			fmt.Println("Correct, you success!")
			break
		}
	}
}
