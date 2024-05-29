package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import result.Result;
import service.UserService;

public class UserController {
    private UserService userService;
    @GetMapping("/getById/{userId}")
    public Result<Integer> getById(@PathVariable int userId){
        // 手动抛出异常
        int a = 10/0;
        return Result.success(userService.getById(userId));}
    @GetMapping("/getById/{userId}")
    public Result<Integer> getById(@PathVariable Integer userId){
        // 手动抛出异常
        int a = 10/0;
        return Result.success(userService.getById(userId));
    }
}
