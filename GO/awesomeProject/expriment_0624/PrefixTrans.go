/*
前缀表达式的计算
算术表达式有前缀表示法、中缀表示法和后缀表示法等形式。
前缀表达式指二元运算符位于两个运算数之前，
例如 23(7-4)+8/4 的前缀表达式是:++2了48 4。请设计程序计算前缀表达式的结果值。

输入格式:
输入在一行内给出不超过30个字符的前缀表达式，
只包含+、、*、/以及运算数，不同对象(运算数、运算符号) 之间以空格分隔

输出格式:
输出前缀表达式的运算结果，保留小数点后1位，或错误信息 ERROR

输入样例:
+ + 2 * 3 - 74 / 84

输出样例:
13.0
*/
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	exp := strings.Fields(scanner.Text())

	stack := []float64{}
	for i := len(exp) - 1; i >= 0; i-- {
		if num, err := strconv.ParseFloat(exp[i], 64); err == nil {
			stack = append(stack, num)
		} else {
			if len(stack) < 2 {
				fmt.Println("ERROR")
				return
			}
			op1 := stack[len(stack)-1]
			op2 := stack[len(stack)-2]
			stack = stack[:len(stack)-2]
			switch exp[i] {
			case "+":
				stack = append(stack, op1+op2)
			case "-":
				stack = append(stack, op1-op2)
			case "*":
				stack = append(stack, op1*op2)
			case "/":
				if op2 == 0 {
					fmt.Println("ERROR")
					return
				}
				stack = append(stack, op1/op2)
			default:
				fmt.Println("ERROR")
				return
			}
		}
	}
	if len(stack) != 1 {
		fmt.Println("ERROR")
	} else {
		fmt.Printf("%.1f", stack[0])
	}
}
