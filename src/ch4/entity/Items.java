package ch4.entity;

import java.sql.Timestamp;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/21 19:21
 */
public class Items {

    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Timestamp createtime;
    private String detail;


    public Items() {
    }

    public Items(Integer id, String name, Double price, String pic, Timestamp createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.createtime = createtime;
        this.detail = detail;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取
     * @return createtime
     */
    public Timestamp getCreatetime() {
        return createtime;
    }

    /**
     * 设置
     * @param createtime
     */
    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String toString() {
        return "Items{id = " + id + ", name = " + name + ", price = " + price + ", pic = " + pic + ", createtime = " + createtime + ", detail = " + detail + "}";
    }
}
