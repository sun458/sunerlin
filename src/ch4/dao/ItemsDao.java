package ch4.dao;

import ch4.entity.Items;

import java.sql.SQLException;
import java.util.List;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/21 19:56
 */
public class ItemsDao extends BaseDao<Items> {

    //条件模糊查询商品表的记录总数
    public Long selectCounts(String query) throws SQLException {
        String sql = "select count(*) from items where name like concat('%',?,'%')";
        Long value = (Long)this.getSingleValue(sql , query);
        return value;
    }

    //分页+条件模糊查询商品表的所有信息
    public List<Items> selectAll(String query , int begin) throws SQLException {
        String sql = "select * from items where name like concat('%',?,'%') limit ?,3";
        List<Items> itemList = this.getBeanList(sql, Items.class, query, begin);
        return itemList;
    }

    //通过商品名称查询信息 精确查询
    public Items selectOne(String name) throws SQLException {
        String sql = "select * from items where name = ?";
        Items items = this.getBean(sql, Items.class, name);
        return items;
    }

    //添加商品信息
    public int insert(Items items) throws SQLException {
        String sql = "insert into items values(null,?,?,?,?,?)";
        int i = this.update(sql, items.getName(), items.getPrice(), items.getDetail(),
                items.getPic(), items.getCreatetime());
        return i;
    }

}
