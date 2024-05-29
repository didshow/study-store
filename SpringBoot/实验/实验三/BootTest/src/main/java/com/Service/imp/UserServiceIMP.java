package com.Service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pojo.User;
import com.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Service.UserService;

import java.util.List;


@Service
@Transactional
public class UserServiceIMP implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(User user) {
        return userMapper.insert(user);
    }//insert

    @Override
    public Integer updateUser(User user) {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", user.getId());

        return userMapper.update(user, queryWrapper);
    }//update

    @Override
    public Integer deleteUser(Long id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);

        return userMapper.delete(queryWrapper);
    }//delet

    @Override
    public List<User> selectListOfUser(Integer start, Integer size) {//select all

        return userMapper.selectAll(start*size, (start+1) * size);
    }

    //single
    @Override
    public User selectSingleOfUser(Long id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public User selectByName(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return userMapper.selectOne(queryWrapper);
    }
    @Override
    public Integer getCountNum(){
        return userMapper.getCounts();
    }


}