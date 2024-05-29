package service;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

        //查询用户
        String selectSql="select * from user";
        List<User> list = userDao.query(selectSql,null);
        for(User u : list){
            System.out.println(u);
        }
    }
}
