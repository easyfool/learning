package com.wangfengbabe.learning.service;

import com.wangfengbabe.learning.model.User;

import java.util.List;

/**
 * Created by wangfeng on 11/8/16.
 */
public interface IUserService {
    public List<User> getAllUsers();

    public User getUsersById(String id);

    public String addUser(User user);
}
