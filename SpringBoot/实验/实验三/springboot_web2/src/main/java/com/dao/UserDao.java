package com.dao;

import com.entity.User;

import java.util.List;

public interface UserDao {
    public void insert(User user);
    public List<User> query(String sql);
}
