package com;


import com.controller.UserController;
import com.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainApp2 {
    @Autowired
    private UserController userController;
    @Test
    public void selectAll(){
        userController.selectAll();
    }

}
