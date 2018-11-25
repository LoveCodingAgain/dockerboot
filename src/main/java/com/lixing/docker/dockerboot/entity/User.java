package com.lixing.docker.dockerboot.entity;

import java.util.Date;
/**
 * title： com.lx.docker.dockerboot.entity
 * @author： lixing
 * date： 2018/3/19 11:29
 * description：对应的实体类
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private Date ctm;
    public User(){}

    public User(Integer id,String username, Integer age, Date ctm) {
        this.id=id;
        this.username = username;
        this.age=age;
        this.ctm=new Date();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}
