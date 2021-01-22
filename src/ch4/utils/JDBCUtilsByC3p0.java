package ch4.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/15 15:09
 */
public class JDBCUtilsByC3p0 {

    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("mysql");

    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    //获得连接对象
    public static Connection getConn(){
        Connection conn = tl.get();
        try {
            if(conn==null || conn.isClosed()){
                conn = dataSource.getConnection();
                tl.set(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //释放连接资源
    public static void closeConn(){
        Connection conn = tl.get();
        if(conn!=null){
            try {
                conn.close();
                //tl.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}




















