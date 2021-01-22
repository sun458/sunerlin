package ch2.entity;

/**
 * @version 1.0
 * @Description TODO
 * @Author sunerlin
 * @Date 2021/1/15 15:03
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Integer age;


    public User() {
    }

    public User(Integer id, String name, String pwd, Integer age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
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
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", pwd = " + pwd + ", age = " + age + "}";
    }
}
