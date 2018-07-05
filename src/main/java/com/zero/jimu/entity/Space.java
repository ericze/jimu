package com.zero.jimu.entity;

import java.math.BigInteger;

public class Space {
    public int getId() {
        return id;
    }

    private void setId(int id) {
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


    public int getFollownum() {
        return follownum;
    }

    public void setFollownum(int follownum) {
        this.follownum = follownum;
    }

    public int getReviewnum() {
        return reviewnum;
    }

    public void setReviewnum(int reviewnum) {
        this.reviewnum = reviewnum;
    }
    public String getCreated_time() {
        return created_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public String created_time;
    public String update_time;
    public int id;
    public String title;
    public String name;
    public String address;
    public String mobile;
    public String head_pic;
    public String about;
    public int is_recommend;
    public int follownum;
    public int reviewnum;
}