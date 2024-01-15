/*
折半查找
输入n值(1<n<1000)、n个非降序排列的整数以及要查找的数x，使用二分查找算法查找x，
输出x所在的下标（0~n-1）及比较次数。 若x不存在，输出-1和比较次数。

输入格式:
输入格式:
第一行是数组的个数n
第二行开始是输入数组的元素
最后一行是需要查找的元素

输出格式:
输出x所在的下标（0~n-1）及比较次数。若x不存在，输出-1和比较次数。

输入样例:
4
1
2
3
4
1

输出样例:
0
2

*/

package main

import (
	"fmt"
	"sort"
)

func BinarySearch(n int, a []int, key int) (x, y int) {
	count := 0
	left := 0
	right := n - 1
	for left <= right {
		count++
		mid := (left + right) / 2
		if key == a[mid] {

			return mid, count
		} else if key < a[mid] {

			right = mid - 1
		} else {

			left = mid + 1
		}
	}
	return -1, count
}
func main() {
	var (
		n   int
		key int
	)

	fmt.Scanln(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scanln(&arr[i])
	}
	sort.Ints(arr)
	fmt.Scanln(&key)
	index, count := BinarySearch(n, arr, key)
	fmt.Println(index)
	fmt.Println(count)
}
