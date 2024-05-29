package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public List<User> query(String sql) {

        String selectSql="select * from user01";
        List<User> list = userDao.query(selectSql);
        for(User u : list){
            System.out.println(u);
        }
        return list;
    }
}
