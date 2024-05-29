package com.Service;


import com.pojo.User;
import java.util.List;

public interface UserService {
//CRUD
    public Integer insertUser(User user);//insert
    public Integer updateUser(User user);//update
    public Integer deleteUser(Long id);//delet
    public List<User> selectListOfUser(Integer start, Integer size);//query
    public User selectSingleOfUser(Long id);//single Select
    public User selectByName(String name);//login
    public Integer getCountNum();//count*
}
