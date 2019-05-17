package com.sc.entity;

import java.util.Date;
import java.util.List;

public class Item {
    private Integer itemId;
    private String itemTitle;
    private User user;
    private String category;
    private ItemType itemType;
    private String region;
    private String address;
    private Date lostTime;
    private List<String> imgs;
    private String lostDetail;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLostTime() {
        return lostTime;
    }

    public void setLostTime(Date lostTime) {
        this.lostTime = lostTime;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    public String getLostDetail() {
        return lostDetail;
    }

    public void setLostDetail(String lostDetail) {
        this.lostDetail = lostDetail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", user=" + user +
                ", category='" + category + '\'' +
                ", itemType=" + itemType +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", lostTime=" + lostTime +
                ", imgs=" + imgs +
                ", lostDetail='" + lostDetail + '\'' +
                '}';
    }
}
