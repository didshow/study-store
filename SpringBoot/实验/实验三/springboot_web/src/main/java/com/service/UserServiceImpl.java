package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao;
    @Override
    public void userJDBC() {
        String insertSql = "insert into students values(?,?,?,?,?)";
        //param数组中的值和values中的值相对应
        Object param0[] = {01,"丽丽",11,"女"};
        Object param1[] = {02,"欢欢",11,"男"};
        Object param2[] = {03,"晨晨",11,"女"};
        Object param3[] = {04,"66",11,"男"};
        Object param4[] = {05,"小树",11,"女"};
        Object param5[] = {07,"小树",11,"女"};
        Object param6[] = {80,"小树",11,"女"};
        Object param7[] = {90,"小树",11,"女"};
        Object param8[] = {00,"小树",11,"女"};
        Object param9[] = {11,"小树",11,"女"};
        //添加用户
        userDao.update(insertSql,param0);
        userDao.update(insertSql,param1);
        userDao.update(insertSql,param2);
        userDao.update(insertSql,param3);
        userDao.update(insertSql,param4);
        userDao.update(insertSql,param5);
        userDao.update(insertSql,param6);
        userDao.update(insertSql,param7);
        userDao.update(insertSql,param8);
        userDao.update(insertSql,param9);
        //查询用户
        String selectSql="select * from user";
        List<User> list = userDao.query(selectSql,null);
        for(User u : list){
            System.out.println(u);
        }
    }
}
