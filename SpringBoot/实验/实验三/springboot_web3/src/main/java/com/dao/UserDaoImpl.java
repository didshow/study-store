package com.dao;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> selectAll() {
        List<User> users = jdbcTemplate.query("select * from user01", new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public int insert(User user) {
        return jdbcTemplate.update("insert into user01(uid,uname,uage,usex) values(?,?,?,?)",
                user.getUid(),user.getUname(),user.getUage(),user.getUsex());

    }
}
