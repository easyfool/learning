package com.wangfengbabe.learning;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 * Created by wangfeng on 11/1/16.
 */
public class UserDaoImpl implements UserDao {

  public void addUser(User user) {

    Connection conn = null;
    PreparedStatement pst = null;
    try {
      conn = JdbcUtils.getConnection();
      String sql = "insert into users(id,name,passwd,email,birthday) values (?,?,?,?,?)";
      pst = conn.prepareStatement(sql);
      pst.setInt(1, user.getId());
      pst.setString(2, user.getName());
      pst.setString(3, user.getPassword());
      pst.setString(4, user.getEmail());
      pst.setDate(5, user.getBirthday() == null ? null : new Date(user.getBirthday().getTime()));
      int count = pst.executeUpdate();
      System.out.println("insert " + count + "records");

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      JdbcUtils.free(null, pst, conn);
    }

  }

  public User getUserById(int id) {

    return null;
  }

  public int update(User user) {
    return 0;
  }

  public int delete(User user) {
    return 0;
  }
}
