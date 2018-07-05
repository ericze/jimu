package com.zero.jimu.entity;

public class User {
    private int id;
    public String name;
    public String openid;
    public String sessionkey;
    public String mobile;
    public String head_img;
    public int is_invalid;
    public int user_type;

    public String getCreated_time() {
        return created_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public String created_time;
    public String update_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public int getIs_invalid() {
        return is_invalid;
    }

    public void setIs_invalid(int is_invalid) {
        this.is_invalid = is_invalid;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
}
