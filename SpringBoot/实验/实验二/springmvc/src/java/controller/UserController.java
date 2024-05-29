package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    //得到一个用来记录日志的对象，这样打印信息的时候能够标记打印的是哪个类的信息
    private static  final Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping
    public String addUser() {
        if (userService.addUser()) {
            System.out.println("UserController:addUser()");
            return "success";
        }
        return "失败";
    }
}
