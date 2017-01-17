package com.wangfengbabe.learning;

import java.sql.*;

/**
 * Created by wangfeng on 11/1/16.
 */
public class JdbcFirstDemo {
    public static void main(String[] args) throws  Exception{
        String url = "jdbc:mysql://localhost:3306/jdbcstudy";
        String userName = "root";
        String password = "root";

        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取与数据库的连接
        Connection connection = DriverManager.getConnection(url,userName,password);

        //3.获取向数据库发送sql的statement
        Statement statement = connection.createStatement();

        //4.向数据库发送sql并获取代表结果集的resultset
        String sql = "select * from users";
        ResultSet resultSet = statement.executeQuery(sql);

        //5.取出结果集中的数据
        while (resultSet.next()){
            System.out.println("id = "+resultSet.getObject("id"));
            System.out.println("name = "+resultSet.getObject("name"));
            System.out.println("email = "+resultSet.getObject("email"));
            System.out.println("password = "+resultSet.getObject("passwd"));
            System.out.println("birthday = "+resultSet.getObject("birthday"));
            System.out.println("-------------------------------------");
        }

        //6.关闭连接,释放资源
        resultSet.close();
        statement.close();
        connection.close();


    }
}
