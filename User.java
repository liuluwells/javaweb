package com.kgc.entity;

public class User {

    private int id;
    private String userName;
    private String password;
    private String hobby;

    public User() {
    }

    public User(int id, String userName, String password, String sex) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.hobby = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return hobby;
    }

    public void setSex(String sex) {
        this.hobby = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
