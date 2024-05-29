package service;

import dao.UserDao;
import entity.User;
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
        Object param0[] = {1,"丽丽",11,"女"};
        Object param1[] = {2,"欢欢",11,"男"};
        Object param2[] = {3,"晨晨",11,"女"};
        Object param3[] = {4,"66",11,"男"};
        Object param4[] = {5,"小树",11,"女"};

        //添加用户
        userDao.update(insertSql,param0);
        userDao.update(insertSql,param1);
        userDao.update(insertSql,param2);
        userDao.update(insertSql,param3);
        userDao.update(insertSql,param4);

        //查询用户
        String selectSql="select * from user";
        List<User> list = userDao.query(selectSql,null);
        for(User u : list){
            System.out.println(u);
        }
    }
}
