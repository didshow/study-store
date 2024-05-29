package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class UserController {
    @Autowired
    private UserService userService;
        @RequestMapping("/insert")
        public String insert(String id,String name,String age,String sex) {
            User user = new User();
            userService.insert(user);
            return "Insert Success!";
        }

}
