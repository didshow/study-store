package main

import (
	"fmt"
	"sort"
	"strings"
)

func CountWords(str []string) map[string]int {

	res := make(map[string]int)

	for _, word := range str {
		if _, ok := res[word]; !ok {
			res[word] = 1
		} else {
			res[word]++
		}
	}
	return res
}
func SortPrint(in map[string]int) {
	keys := make([]string, 0)
	for key := range in {
		keys = append(keys, key)
	}
	sort.Strings(keys)
	for _, key := range keys {
		n := len(key)
		for i := 0; i < n; i++ {
			if key[i] < 'a' && key[i] < 'z' {
				break
			}
		}
		strings.ToLower(key)
		fmt.Printf("\"%s\": %d\n", key, in[key])

	}

}
func main() {
	var str string
	strs := make([]string, 0)
	for {
		_, err := fmt.Scan(&str)

		if err != nil {
			break
		}
		strs = append(strs, str)

	}
	res := CountWords(strs)
	SortPrint(res)
}
