package com.model;

/**
 *   虚表 相当于information的视图，只有用户名和密码属性
 * @author Embrace
 */
public class User {
    private int id;//编号
    private String userName;//用户名
    private String password;//密码

    public User(){
        super();
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
