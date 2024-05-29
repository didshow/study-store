package service;

import org.springframework.stereotype.Service;
import pojo.User;

import java.util.ArrayList;

/**
 * Created by wangchao on 2021/11/30.
 */
@Service
public class UserServiceImpl implements UserService {
    //使用静态集合变量users模拟数据库
    private  static  ArrayList<User> users = new ArrayList<User>();


    @Override
    public boolean addUser(User u) {
        if(!"IT民工".equals(u.getCarrer())){
            users.add(u);
            return true; //不允许添加IT民工
        }
        return false;
    }

    @Override
    public ArrayList<User> getUsers() {
        return users;
    }
}
