/*
字符串匹配
括号匹配
给出{{{}}{}},{{}},{},{{{{{{}}}}}},等表示为括号正确匹配。
现给出一个由多个’{‘,’}’组成的字符串，判断是否为正确匹配，
正确则输出“correct!”，错误则输出“error!”。只需匹配‘{’和‘}’。
提示：在计算机编程思想中有中数据结果为“栈”。
栈模型就像向一个有底小桶，先放进去的东西只能在最后才能取出，
后放进去的东西能先取出。比如按顺序放入12345号物品，取出顺序为54321。
例：

输入格式:
一个由多个’{‘,’}’组成的字符串

输出格式:
字符串 correct!/error!

输入样例:
{[]}

输出样例:
correct!
*/
package main

import (
	"fmt"
)

func isMatch(s string) bool {
	stack := make([]byte, 0)
	for i := 0; i < len(s); i++ {
		if s[i] == '{' {
			stack = append(stack, s[i])
		} else if s[i] == '}' {
			if len(stack) == 0 {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}
	return len(stack) == 0
}

func main() {
	var s string
	fmt.Scan(&s)

	// 判断是否为正确匹配
	if isMatch(s) {
		fmt.Println("correct!")
	} else {
		fmt.Println("error!")
	}
}
