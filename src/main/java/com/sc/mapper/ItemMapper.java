package com.sc.mapper;

import com.sc.entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

    /**
     * 通过类型Id过去项目列表
     * @param typeId
     * @return
     */
    List<Item> getItemListByTypeId(Integer typeId);

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

    /**
     * 通过用户ID获取项目列表
     * @param userId
     * @return
     */
    List<Item> getItemListByUserId(Integer userId);


}
