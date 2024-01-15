/*
约瑟夫环
有 n 个人围成一圈，从第 k 个人开始报数，报到 m 的人出圈。
下一个人从 1 开始报数，报到 m 的人出圈。
直到所有人都出圈，输出每次出圈人的编号。

输入格式:
输入三个整数,分别是n,k,m

输出格式:
每次出圈人的编号,若输入不合规范,输出:
Invalid input

输入样例:
10 3 4

输出样例:
4 8 2 7 3 10 9 1 6 5
*/
package main

import "fmt"

type Node struct {
	Val  int
	Next *Node
}

func main() {
	var n, k, m int
	fmt.Scan(&n, &k, &m)
	if n <= 0 || m <= 0 || k <= 0 || k > n {
		fmt.Println("Invalid input")
	} else {
		head := &Node{1, nil}
		prev := head
		for i := 2; i <= n; i++ {
			node := &Node{i, nil}
			prev.Next = node
			prev = node
		}
		prev.Next = head
		count := 0
		curr := head
		var prev2 *Node
		for n > 0 {
			count++
			if count == m {
				fmt.Print(curr.Val, " ")
				prev2.Next = curr.Next
				curr = curr.Next
				n--
				count = 0
				continue
			}
			prev2 = curr
			curr = curr.Next
		}
	}

}
