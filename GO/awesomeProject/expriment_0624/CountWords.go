/*
计算字符串中每个单词出现的次数
编写一个程序，读入一个字符串，以换行为界,统计其中每个单词出现的次数，
并按照单词出现次数从大到小输出(若出现次数相同则按照字母顺序输出)。

输入格式:
一串字符串

输出格式:
单词 和 出现次数

输入样例:
apple apple book book awk awk www

输出样例:
"apple": 2
"awk": 2
"book": 2
"www": 1
*/
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	var lines []string
	for scanner.Scan() {
		line := scanner.Text()
		if line == "" {
			break
		}
		lines = append(lines, line)
	}
	s := strings.Join(lines, " ")
	words := make(map[string]int)
	for _, word := range strings.FieldsFunc(strings.ToLower(s), func(r rune) bool {
		return !('a' <= r && r <= 'z')
	}) {
		words[word]++
	}
	type wordCount struct {
		word  string
		count int
	}
	var counts []wordCount
	for word, count := range words {
		counts = append(counts, wordCount{word, count})
	}
	sort.Slice(counts, func(i, j int) bool {
		if counts[i].count == counts[j].count {
			return counts[i].word < counts[j].word
		}
		return counts[i].count > counts[j].count
	})
	for _, wc := range counts {
		fmt.Printf("%q: %d\n", wc.word, wc.count)
	}
}
