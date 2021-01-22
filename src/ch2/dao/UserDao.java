package ch2.dao;

import ch2.entity.User;

import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/15 15:09
 */
public class UserDao extends BaseDao<User> {
    //通过姓名和密码查询用户信息
    public User selectOne(String username , String password) throws SQLException {
        User user = this.getBean("select * from user where name = ? and password = ?", User.class, username, password);
        return user;
    }
    
}
