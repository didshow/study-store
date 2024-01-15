/*
剪子布游戏
现在有两个人在玩石头剪子布游戏，请你判断最后谁赢了。
用R代表石头，S代表剪子，P代表布。

输入格式:
输入的第一行是一个整数t ,表示测试样例的数目。
每组输入样例的第一行是一个整数n ，表示游戏次数。
接下来n行，每行由两个字母组成，两个字母之间用一个空格分隔，
这些字母只会是R，S或P。
第一个字母表示Player1的选择，第二个字母表示Player2的选择。

输出格式:
对于每组输入样例，输出获胜方的名字（Player1或Player2），
如果平局，则输出TIE。

输入样例:
3
R P
S R
P P
输出样例:
Player2
Player2
TIE
*/
package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	var player1_win = []int{}
	var player2_win = []int{}
	player1_win = make([]int, n)
	player2_win = make([]int, n)

	for i := 0; i < n; i++ {
		var player1_str string
		var player2_str string
		fmt.Scanln(&player1_str, &player2_str)

		switch {
		case player1_str == "R" && player2_str == "S":
			player1_win[i]++
		case player1_str == "S" && player2_str == "P":
			player1_win[i]++
		case player1_str == "P" && player2_str == "R":
			player1_win[i]++
		case player2_str == "R" && player1_str == "S":
			player2_win[i]++
		case player2_str == "S" && player1_str == "P":
			player2_win[i]++
		case player2_str == "P" && player1_str == "R":
			player2_win[i]++
		}

	}
	for i := 0; i < n; i++ {
		if player1_win[i] > player2_win[i] {
			fmt.Println("Player1")
		} else if player2_win[i] > player1_win[i] {
			fmt.Println("Player2")
		} else {
			fmt.Println("TIE")
		}
	}

}
