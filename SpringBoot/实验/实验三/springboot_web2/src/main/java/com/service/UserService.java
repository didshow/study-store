package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    public void insert(User user);
    public List<User> query(String sql);
}
