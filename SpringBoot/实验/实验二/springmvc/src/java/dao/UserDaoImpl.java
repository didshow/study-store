package dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public boolean addUser() {
        System.out.println("UserDao:addUser()");
        return true;
    }
}
