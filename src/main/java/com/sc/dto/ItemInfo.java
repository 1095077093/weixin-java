package com.sc.dto;

import com.sc.entity.Item;

import java.util.List;

public class ItemInfo {

    private Boolean hasNext;
    private Integer pageNo;
    private Integer pageSize;
    private List<Item> items;

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ItemInfo{" +
                "hasNext=" + hasNext +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", items=" + items +
                '}';
    }
}
