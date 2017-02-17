package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 11/3/16.
 */
public class UserServiceImpl implements UserService {

  public void setDao(UserDao dao) {
    this.dao = dao;
  }

  public UserDao dao;

  public void addUser(User user) {
    dao.addUser(user);
  }
}
