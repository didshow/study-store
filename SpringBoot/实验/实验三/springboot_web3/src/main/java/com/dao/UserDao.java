package com.dao;

import com.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();
    public int insert(User user);
}
