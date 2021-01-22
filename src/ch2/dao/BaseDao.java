package ch2.dao;

import ch2.utils.JDBCUtilsByC3p0;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/15 15:08
 */
public class BaseDao<T> {
    private QueryRunner runner = new QueryRunner();

    //增删改

    //查询单个对象
    public T getBean(String sql, Class<T> clazz , Object...params) throws SQLException {
        T t = runner.query(JDBCUtilsByC3p0.getConn(), sql, new BeanHandler<>(clazz), params);
        return t;
    }
}
