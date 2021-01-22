package ch2.service;

import ch2.dao.UserDao;
import ch2.entity.User;
import ch2.utils.JDBCUtilsByC3p0;

import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/15 15:02
 */
public class UserService {

    private UserDao dao = new UserDao();

    public User login(String username , String password){
        User user = null;
        try {
            user = dao.selectOne(username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            JDBCUtilsByC3p0.closeConn();
        }

        return user;
    }

}
