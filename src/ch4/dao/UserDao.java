package ch4.dao;

import ch4.entity.User;

import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/21 19:46
 */
public class UserDao extends BaseDao<User> {
    public User selectOne(String name , String pwd) throws SQLException {
        String sql = "select * from user where name = ? and pwd = ?";
        User user = this.getBean(sql, User.class, name, pwd);
        return user;
    }
}
