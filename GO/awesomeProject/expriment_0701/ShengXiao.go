/*
生肖确定
2023年是兔年，1年后（2024年）是龙年，1年前（2022年）是虎年。
那么对于给定的一个整数n，请确定2023年之前（n为负数）或之后（n为正数）
∣n∣年的结果年份及其对应的生肖。
鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、猪等十二生肖相应的英文单词如下：

rat、ox、tiger、rabbit、dragon、snake、horse、goat、monkey、rooster、dog、pig

输入格式:
首先输入一个正整数T，表示测试数据的组数，然后是T组测试数据。每组测试输入1个整数n (−2023<n≤10000，n

=0)。

输出格式:
对于每组测试，在一行上输出结果年份及其对应的生肖，之间以一个空格间隔。

输入样例:
3
-1
1
2

输出样例:
2022 tiger
2024 dragon
2025 snake
*/
package main

import (
	"fmt"
)

func ShengXiao(year int) string {
	shengxiao := []string{"rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger"}
	index := (year - 2023) % 12
	if index < 0 {
		index += 12
	}
	return shengxiao[index]
}
func main() {
	var n int
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		var x int
		fmt.Scan(&x)
		year := 2023 + x
		value := ShengXiao(year)
		fmt.Printf("%d %s\n", year, value)
	}
}
