package com.wangfengbabe.learning;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by wangfeng on 11/1/16.
 */
public class JdbcUtils {
    private static String userName = "root";
    private static String password = "root";
    private static String dbName = "learning";
    private static String url = "jdbc:mysql://localhost:3306/" + dbName + "?user=" + userName + "&password=" + password;

    private static DataSource dataSource = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private JdbcUtils() {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static void free(ResultSet rs, Statement st, Connection conn) {

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

