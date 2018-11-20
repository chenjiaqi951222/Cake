package com.imooc.cake.entity;
import java.util.Date;

/**
 * 蛋糕
 */
public class Cake {
    private Long id;

    private Long categoryId;

    private String name;

    /**
     * 级别（几颗星）
     */
    private Integer lever;

    /**
     * 价格，整型，以分为单位存储
     */
    private Integer price;

    private byte[] smallImg;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public byte[] getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(byte[] smallImg) {
        this.smallImg = smallImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
