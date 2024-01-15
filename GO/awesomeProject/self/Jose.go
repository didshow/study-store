package main

import (
	"fmt"
)

type Node struct {
	Val  int
	Next *Node
}

func (node *Node) Jose(n, k, m int) []int {
	res := make([]int, 0)
	head := &Node{Val: 1, Next: nil}
	prev := head
	var newNode *Node
	for i := 2; i <= n; i++ {
		newNode = &Node{Val: i, Next: nil}
		prev.Next = newNode
		prev = newNode
	}
	newNode.Next = head
	curr := head

	for i := 0; i < k; i++ {
		curr = curr.Next
	}
	count := 0

	for n > 0 {
		count++
		if count == m {
			res = append(res, curr.Val)
			curr.Next = curr.Next.Next

			count = 0
			n--
			continue
		}
		curr = curr.Next

	}
	return res
}

func main() {
	var n, k, m int
	if k < 0 || n < 0 || m < 0 || k > n {
		fmt.Println("Invalid input")
	} else {
		node := &Node{}
		res := node.Jose(n, k, m)
		for i := 0; i < len(res); i++ {
			if i == len(res)-1 {
				fmt.Printf("%d\n", res[i])
			} else {
				fmt.Printf("%d ", res[i])
			}
		}
	}
}
