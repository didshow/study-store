package com.example.demo.repository;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository1 {

    public  int save(@Param("user") User user);
    public int delete(@Param("id")int id);
    public int update(@Param("user")User user);
    public User  findbyId(@Param("id")int id);
}
