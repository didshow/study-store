package com.Servlet;


import com.Resp.BaseRespones;
import com.Service.UserService;
import com.Utils.IDMaker;
import com.Utils.SHA_256;
import com.request.UserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import com.pojo.User;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public BaseRespones<Integer> insertUser(@RequestBody User user) {//insertPath
        log.info("insert:" + user.toString());
        SHA_256 sha256=new SHA_256();
        user.setPassword(sha256.encrypt(user.getPassword()));//SHA_256
        user.setId(IDMaker.IDMake());

        return BaseRespones.success(userService.insertUser(user));
    }

    @PostMapping("/update")
    public BaseRespones<Integer> updateUser(@Nullable @RequestBody User user) {
        log.info("update:" + user.toString());
        return BaseRespones.success(userService.updateUser(user));
    }//update

    @RequestMapping("/delet")
    public BaseRespones<Integer> deletUser(Long id) {
        log.info("delete:" + id.toString());
        return BaseRespones.success(userService.deleteUser(id));
    }//deletAll

    @GetMapping("/select")
    public BaseRespones<List<User>> selectListOf(Integer start, Integer size) {//selectAll Data
        if (start == null || start < 0) {
            start = 0;
        }
        if (size == null || size < 0) {
            size = 10;
        }
        List<User> list = userService.selectListOfUser(start, size);
        log.info(list.toString());
        return BaseRespones.success(list);

    }

    @GetMapping("/single")
    public BaseRespones<User> selectSingleOfuser(Long id) {
        User user = userService.selectSingleOfUser(id);
        log.info(user.toString());
        return BaseRespones.success(user);
    }

    @PostMapping("/login")
    public BaseRespones<Boolean> userLogin(@RequestBody UserReq user) {
        if (user == null) {
            return BaseRespones.failed("参数错误");
        }
        User user1 = userService.selectByName(user.getName());
        SHA_256 sha256 = new SHA_256();
        String encrypt = sha256.encrypt(user.getPassword());
        if (!encrypt.equals(user1.getPassword())) {
            return BaseRespones.failed("登录失败");
        }
        return BaseRespones.success("成功");
    }
    @GetMapping("/getCount")
    public BaseRespones<Integer> getContAll(){
        return BaseRespones.success(userService.getCountNum());
    }
    @PutMapping("/adduser")
    public BaseRespones<Boolean> addUser(){
        List<User> name_sex_age = IDMaker.getName_Sex_age(10);
        SHA_256 sha256=new SHA_256();
        String encrypt = sha256.encrypt("123456");
        for (User user : name_sex_age) {
            user.setPassword(encrypt);
            userService.insertUser(user);
        }
        return BaseRespones.success();
    }




}
