package com.wangfengbabe.learning.dao.impl;

import com.wangfengbabe.learning.dao.IUserDao;
import com.wangfengbabe.learning.model.User;
import com.wangfengbabe.learning.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangfeng on 11/8/16.
 */
@Component
public class UserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UUIDGenerator uuidGenerator;

    @Override
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<User>();
        list = jdbcTemplate.query("SELECT * FROM USER", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getString("ID"));
                user.setUsername(resultSet.getString("USERNAME"));
                user.setPassword(resultSet.getString("PASSWORD"));
                user.setEmail(resultSet.getString("EMAIL"));
                return user;
            }
        });
        return list;
    }

    @Override
    public User getUsersById(String id) {
        User user= jdbcTemplate.queryForObject("SELECT * FROM user WHERE  ID = ?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getString("ID"));
                user.setUsername(resultSet.getString("USERNAME"));
                user.setPassword(resultSet.getString("PASSWORD"));
                user.setEmail(resultSet.getString("EMAIL"));
                return user;
            }
        }, id);
        return user;
    }

    @Override
    public String addUser(User user) {
        String key = uuidGenerator.generate();
        jdbcTemplate.update("insert into user(id,username,password,email) values (?,?,?,?)", key, user.getUsername(), user.getPassword(),user.getEmail());
        return key;
    }


}
