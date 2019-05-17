package com.sc.dto;

import java.util.List;

public class ItemResponse {

    private String itemTitle;
    private Integer typeId;
    private int index;
    private String category;
    private String lostTime;
    private List<String> region;
    private String address;
    private String lostDetail;
    private List<String> imgs;

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLostTime() {
        return lostTime;
    }

    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLostDetail() {
        return lostDetail;
    }

    public void setLostDetail(String lostDetail) {
        this.lostDetail = lostDetail;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ItemResponse{" +
                "itemTitle='" + itemTitle + '\'' +
                ", typeId=" + typeId +
                ", index=" + index +
                ", category='" + category + '\'' +
                ", lostTime='" + lostTime + '\'' +
                ", region=" + region +
                ", address='" + address + '\'' +
                ", lostDetail='" + lostDetail + '\'' +
                ", imgs=" + imgs +
                '}';
    }
}
