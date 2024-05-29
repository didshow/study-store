package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public int insert(User user);
}
