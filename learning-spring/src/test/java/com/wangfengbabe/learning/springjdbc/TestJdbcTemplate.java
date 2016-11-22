package com.wangfengbabe.learning.springjdbc;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


/**
 * Created by wangfeng on 11/11/16.
 */
public class TestJdbcTemplate {
    static JdbcTemplate jdbcTemplate = null;
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config/applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }

    @Before
    public void setUpBefore() throws Exception {

    }

    /**
     *
     */
    @Test
    public void test() {
        //1.create a table to test
        jdbcTemplate.execute("CREATE  TABLE test(ID INTEGER PRIMARY KEY  NOT NULL AUTO_INCREMENT," +
                "                                USERNAME VARCHAR (40),BIRTHDAY  DATE)");
        //2.querry before insert any record
        //2.1 query record count
        int rowCount = jdbcTemplate.queryForObject("SELECT  COUNT(*) FROM  test", Integer.class);
        assertThat("result should be 0 since there is no record currently", rowCount, equalTo(0));

        //2.2 query username
        // thrown.expect(IncorrectResultSizeDataAccessException.class);
        String username = null;
        try {
            username = jdbcTemplate.queryForObject("SELECT USERNAME FROM test", String.class);
        } catch (IncorrectResultSizeDataAccessException e) {
            //IncorrectResultSizeDataAccessException -- if the query does not return exactly one row,or does not return exactly one column in that row

        }

        //3.insert record
        int insert1 = jdbcTemplate.update("INSERT  INTO  test(USERNAME,BIRTHDAY) VALUES ('郭靖','1132-01-01')");
        int insert2 = jdbcTemplate.update("INSERT  INTO  test(USERNAME,BIRTHDAY) VALUES ('黄蓉','1136-09-21')");
        int insert3 = jdbcTemplate.update("INSERT  INTO  test(USERNAME,BIRTHDAY) VALUES ('杨过','1156-12-21')");
        assertThat("", insert1 + insert2 + insert3, equalTo(3));

        //4.query after inserting
        rowCount = jdbcTemplate.queryForObject("SELECT  COUNT(*) FROM  test", Integer.class);
        assertThat("result should be 3ß", rowCount, equalTo(3));
        //this statement should also be ok since queryForObject are override for
        //queryForObject(String sql, Object[] objs,Class<T> requiredType) and queryForObject(String sql,Class<T> requiredType, Object... objs)
        // rowCount = jdbcTemplate.queryForObject("SELECT  count(*) FROM test where ID = ?",new Object[]{1},Integer.class);
        //
        rowCount = jdbcTemplate.queryForObject("SELECT  count(*) FROM test where ID = ?", Integer.class, new Object[]{1});
        assertThat("", rowCount, equalTo(1));

        username = jdbcTemplate.queryForObject("SELECT USERNAME FROM TEST WHERE ID = ? AND USERNAME = ?", String.class, 1, "郭靖");
        assertThat("", username, equalTo("郭靖"));

        Date date = jdbcTemplate.queryForObject("SELECT  birthday FROM test WHERE id = 2", java.sql.Date.class);
        System.out.println(date);


        User user = null;
        //只能用于java中基本类型的包装类型class,不能用于自定义的类
        // user = jdbcTemplate.queryForObject("SELECT  * FROM  test where id = 1",User.class);
        //自定义类bean的查询方法如下
        //(1) BeanPropertyRowMapper
        user = jdbcTemplate.queryForObject("SELECT  * FROM test WHERE id = ?", new BeanPropertyRowMapper<User>(User.class), 2);
        assertNotNull(user);
        System.out.println(user);
        //(2)
        user = jdbcTemplate.queryForObject("SELECT  * FROM test WHERE id = 2", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("ID"));
                user.setUsername(resultSet.getString("USERNAME"));
                user.setBirthday(resultSet.getDate("BIRTHDAY"));
                return user;
            }
        });
        System.out.println(user);

        //queryForList
        List<String> list = jdbcTemplate.queryForList("SELECT username FROM  test",String.class);
        System.out.println(list);
        list = jdbcTemplate.queryForList("SELECT  username FROM  test WHERE id !=?",String.class,1);
        System.out.println(list);
        List<Map<String,Object>> maps = jdbcTemplate.queryForList("SELECT  username,birthday FROM  test WHERE id !=?",1);
        System.out.println(maps);

       List users = jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("");
                

                return null;
            }
        }, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }
        });


        //5.upate
        //6.procedure
        //7.delete record
        //8.truncate table

        //9.drop table
        jdbcTemplate.execute("DROP  TABLE  test");

    }


//    //queryForObject(Sting sql,Class<T> requireType)
//    //IncorrectResultSizeDataAccessException -- if the query does not return exactly one row,or does not return exactly one column in that row
//    @Test(expected = IncorrectResultSizeDataAccessException.class)
//    public void testStaticQueryForObject() {
//        int rowCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TEST", Integer.class);
//        assertThat("before insert any record, result should be 0", rowCount, equalTo(0));
//        String username = jdbcTemplate.queryForObject("SELECT USERNAME FROM TEST", String.class);
//    }
//
//    @Test
//    public void testInsert() {
//        int a = jdbcTemplate.update("INSERT INTO TEST(USERNAME,BIRTHDAY) VALUES ('GUANYU','1998-12-21')");
//        int b = jdbcTemplate.update("INSERT INTO TEST(USERNAME,BIRTHDAY) VALUES ('张飞','1998-12-21')");
//        assertThat(a + b, equalTo(2));
//    }


}
