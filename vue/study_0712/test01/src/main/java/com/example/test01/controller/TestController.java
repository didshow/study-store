package com.example.test01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // http://localhost:8080/test?nickname=zhangsan
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String Test(String nickname,String phone){
        System.out.println(phone);
        return "I'm "+nickname;
    }

}
