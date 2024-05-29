package com.controller;

import com.exception.BizException;
import com.exception.ExceptionEnum;
import com.result.ResultResponse;
import com.result.Result;
import com.service.UserService;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("list")
    public List<User> selectAll(){
        List<User> users = userService.selectAll();
        for(User u:users){
            System.out.println(u);
        }
        return userService.selectAll();
    }
    @PostMapping("insert")
    public Result insert(@RequestBody User user){
        userService.insert(user);
        return Result.success(user);
    }
    @PostMapping("/add")public boolean add(@RequestBody User user) {
        //如果姓名为空就手动抛出一个自定义的异常！
        if(user.getUname()==null){
            throw  new BizException("-1","用户姓名不能为空！");
        }
        return true;
    }
    @PutMapping("/update")public boolean update(@RequestBody User user) {
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
        }
    @DeleteMapping("/delete")public boolean delete(@RequestBody User user)  {
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return true;
    }
}
