package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 11/1/16.
 */
public interface UserDao {
    public void addUser(User user);

    public User getUserById(int id);

    public int update(User user);

    public int delete(User user);
}
