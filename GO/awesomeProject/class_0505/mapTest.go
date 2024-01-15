package main

import "fmt"

/*
*
map[string]int userinfo:= make(map[string]int,8)
delete :

map[]
after init
map["中国":["北京","上海"]]

--- 函数，接口、并发、struct ---
*/
func main() {
	testMap()
}
func testMap() {

	userinfo := make(map[string]string, 8)
	userinfo["jake"] = "234567"
	userinfo["rose"] = "234567"
	userinfo["lily"] = "234567"
	//v, ok := userinfo["rose"]
	//if ok {
	//
	//} else {
	//	fmt.Println("none")
	//}
	fmt.Println(userinfo)
	fmt.Println(userinfo["username"])
	fmt.Println(userinfo["password"])
	for k, v := range userinfo {
		fmt.Println(k, v)
	}
}
