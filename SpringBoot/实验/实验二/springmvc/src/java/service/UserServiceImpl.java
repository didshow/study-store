package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
        @Override
    public boolean addUser() {
            if(userDao.addUser()){
                System.out.println("UserService:addUser()");
                return true;
            }
        return false;
    }
}
