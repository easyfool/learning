package com.wangfengbabe.learning;

import javax.xml.transform.Result;
import java.sql.*;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws SQLException {
    System.out.println("Hello World!");

    Connection connection = JdbcUtils.getConnection();
    //call store procedure without parameters
    CallableStatement cs1 = connection.prepareCall("{call proc_get_all_students()}");
    cs1.execute();
    ResultSet rs = cs1.getResultSet();
    while (rs.next()) {
      System.out.println(rs.getInt("id"));
      System.out.println(rs.getString("name"));
      System.out.println(rs.getDate("birthday"));
      System.out.println(rs.getDouble("score"));
      System.out.println("--------------------");
    }

    rs.close();
    cs1.close();
    CallableStatement cs2 = connection.prepareCall("{call proc_get_1_out(?)}");
    cs2.registerOutParameter(1, Types.VARCHAR);
    cs2.execute();
    String result = cs2.getString("OUTSTR");
    System.out.println(result);
    cs2.close();
    connection.close();
  }
}
