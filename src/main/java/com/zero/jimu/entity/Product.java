package com.zero.jimu.entity;

import java.util.ArrayList;
import com.zero.jimu.entity.ProductImage;
import java.util.List;

public class Product {
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    public int getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(int is_hot) {
        this.is_hot = is_hot;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
    public String head_pic;
    public String about;
    public String trademark;
    public float price;
    public String detail;
    public int repertory;
    public int categoryid;
    public int brandid;
    public int is_hot;
    public int type;
    public int is_recommend;
    public int follownum;
    public int reviewnum;

    public List<ProductImage> getPicList() {
        return picList;
    }

    public void setPicList(List picList) {
        this.picList = picList;
    }

    public List<ProductImage> picList;
}