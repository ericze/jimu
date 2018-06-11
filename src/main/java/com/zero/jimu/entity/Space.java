package com.zero.jimu.entity;

import java.math.BigInteger;

public class Space {
    public BigInteger getId() {
        return id;
    }

    private void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHead_pic() {
        return head_pic;
    }

    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getIs_recommend() {
        return is_recommend;
    }

    public void setIs_recommend(int is_recommend) {
        this.is_recommend = is_recommend;
    }

    public int getFollownumber() {
        return follownumber;
    }

    public void setFollownumber(int follownumber) {
        this.follownumber = follownumber;
    }

    private BigInteger id;
    public String title;
    public String name;
    public String address;
    public String mobile;
    public String head_pic;
    public String about;
    public int is_recommend;
    public int follownumber;
}
