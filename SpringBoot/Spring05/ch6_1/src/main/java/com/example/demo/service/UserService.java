package com.example.demo.service;

import com.example.demo.entity.MyUser;

import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */
public interface UserService {

    public void saveAll();
    public List<MyUser> findAll();
    public MyUser findByUname(String uname);
    public List<MyUser> findByUnameLike(String uname);
    public MyUser getOne(int id);

}
