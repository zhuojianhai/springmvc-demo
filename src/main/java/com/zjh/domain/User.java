package com.zjh.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

    private String username;
    private String  password;

    private Integer age;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date= date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
