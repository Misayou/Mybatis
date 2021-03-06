package com.entity;

import java.util.Date;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/5
 * @Description: com.entity
 * @versio: 1.0
 */
public class user {
    private Integer id;
    private String username;
    private String sex;
    private String address;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public user() {
    }

    public user(Integer id, String username, String sex, String address, Date birthday) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
