package com.sc.service;

import com.sc.entity.Item;

import java.util.List;

public interface ItemService {

    /**
     * 通过类型Id过去项目列表
     * @param typeId
     * @return
     */
    List<Item> getItemListByTypeId(Integer typeId,Integer pageNo,Integer pageSize);

    /**
     * 通过项目ID获取项目列表
     * @param itemId
     * @return
     */
    Item getItemByItemId(Integer itemId);

    /**
     * 添加
     * @param item
     */
    void addItem(Item item);

    /**
     * 更新
     * @param item
     */
    void updateItem(Item item);

    /**
     * 删除
     * @param itemId
     */
    void deleteItem(Integer itemId);

    List<Item> getItemListByUserId(Integer userId);
}
