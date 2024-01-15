package main

import (
	"database/sql"
	"fmt"
	_ "github.com/go-sql-driver/mysql"
	"time"
)

// 方便后续如果有改动时改变
const (
	USERNAME = "root"
	PASSWORD = "123456"
	NETWORK  = "tcp"
	SERVER   = "localhost"
	PORT     = 3307
	DATABASE = "student"
)

/*
*
user表结构体定义
*/
type User struct {
	Id      int    `json:"id"form:"id"`
	Name    string `json:"name" from:"name"`
	Age     int    `json:"age" from:"age"`
	Address string `json:"address" from:"address"`
}

/*
数据库地址： 格式为：数据库用户名：数据库密码 @tcp(数据库所在主机的ip地址)/数据库的名称？charset=uft8
dbUsername+":"+dbPassword+"@tcp("+dbHostIp+")/"+dbName+"?charset=utf8"
*/
func main() {
	conn := fmt.Sprintf("%s:%s@%s(%s:%d)/%s", USERNAME, PASSWORD, NETWORK, SERVER, PORT, DATABASE)
	// sql.Open(“驱动名称，数据库地址”)
	DB, err := sql.Open("mysql", conn+"?charset=utf8")
	// 如果有错误，那么连接数据库失败
	if err != nil {
		fmt.Println("connection to mysql failed:", err)
		return
	}
	// 最大连接周期，超时连接就close
	DB.SetConnMaxLifetime(100 * time.Second)
	// 设置最大连接数
	DB.SetMaxOpenConns(100)
	CreateTable(DB)
	Insert(DB)
}

/*
*
创建表
*/
func CreateTable(DB *sql.DB) {
	sql := `CREATE TABLE IF NOT EXISTS users(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name VARCHAR(64),
	age INT,
	address VARCHAR(64)
);`
	// DB.Exec()表示执行sql语句
	if _, err := DB.Exec(sql); err != nil {
		fmt.Println("create table failed: ", err)
		return
	}
	fmt.Println("create table success!")
}

/*
*
在表中添加数据
*/
func Insert(DB *sql.DB) {
	// 添加数据返回值为被影响行
	result, err := DB.Exec("insert into students(name,age,address) values (?,?)", "student", "123456")
	if err != nil {
		fmt.Printf("Insert data failed: %v", err)
		return
	}
	lastInsertID, err := result.LastInsertId()
	if err != nil {
		fmt.Printf("Get insert id failed: %v", err)
		return
	}
	fmt.Println("Insert data id: ", lastInsertID)
	rowSaffected, err := result.RowsAffected()
	if err != nil {
		fmt.Printf("Get RowsAffected failed: %v", err)
		return
	}
	fmt.Println("Affected rows: ", rowSaffected)
}
