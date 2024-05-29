package service;

import pojo.User;

import java.util.ArrayList;

/**
 * Created by wangchao on 2021/11/30.
 */
public interface UserService {

    boolean addUser(User u);
    ArrayList<User> getUsers();
}
