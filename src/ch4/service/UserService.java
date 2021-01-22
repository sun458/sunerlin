package ch4.service;

import ch4.dao.UserDao;
import ch4.entity.User;
import ch4.utils.JDBCUtilsByC3p0;

import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/21 20:39
 */
public class UserService {

    private UserDao dao = new UserDao();

    //登录
    public User login(String name , String pwd){
        User user = null;
        try {
            user = dao.selectOne(name, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByC3p0.closeConn();
        }
        return user;
    }

}
