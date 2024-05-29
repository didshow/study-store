package com.dao;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert(User user) {
        jdbcTemplate.update("insert into user01(uid,uname,uage,usex) values (?,?,?,?)");
    }

    @Override
    public List<User> query(String sql) {

        return jdbcTemplate.query("select * from user01");
    }
}
