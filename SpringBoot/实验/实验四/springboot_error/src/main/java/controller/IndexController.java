package controller;

import exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/testException"})
    public String testException(String user) {
        if ("user".equals(user)) {
            throw new UserNotExistException();
        }
        //跳转到登录页 login.html
        return "login";
    }
}