package com.wangfengbabe.learning.service.impl;

import com.wangfengbabe.learning.dao.IUserDao;
import com.wangfengbabe.learning.model.User;
import com.wangfengbabe.learning.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wangfeng on 11/8/16.
 */
@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUsersById(String id) {
        return userDao.getUsersById(id);
    }

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }

}
