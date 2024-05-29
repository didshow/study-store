package service;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao;
    @Override
    public void userJDBC() {
        String insertSql = "insert into user values(?,?,?,?)";
        //param数组中的值和values中的值相对应
        Object param0[] = {1,"张一",11,"女"};
        Object param1[] = {2,"张二",11,"男"};
        Object param2[] = {3,"张三",11,"女"};
        Object param3[] = {4,"张四",11,"男"};
        Object param4[] = {5,"张五",11,"女"};
        Object param5[] = {6,"张六",11,"男"};
        Object param6[] = {7,"张七",11,"女"};
        Object param7[] = {8,"张八",11,"男"};
        Object param8[] = {9,"张九",11,"女"};
        Object param9[] = {10,"张十",11,"男"};
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
