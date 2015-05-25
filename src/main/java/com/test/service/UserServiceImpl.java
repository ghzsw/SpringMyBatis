package com.test.service;

import com.test.dao.UserMapper;
import com.test.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zsw on 15-3-14.
 */
@Service("userService")
public class UserServiceImpl implements Iservice{

    private UserMapper userMapper;


    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Resource(name = "bCryptPasswordEncoder")
    private PasswordEncoder passwordEncoder;

    @Override
    public int insert(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
       return userMapper.insert(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User queryByUser(User user) {
        return userMapper.queryByUser(user);
    }

    @Override
    public int upateByUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteByUser(User user) {
        return userMapper.deleteByPrimaryKey(user.getId());
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
}
