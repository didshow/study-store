package com;

import com.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        // 第一个参数是该类的名字.class 第二个参数是main方法中的参数
        SpringApplication.run(MainApp.class, args);
    }
}

