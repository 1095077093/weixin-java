package com.sc.service;

import com.sc.entity.ItemType;

import java.util.List;

public interface ItemTypeService {

    List<ItemType> getItemTypeList();

    /**
     * 通过类型名称获取类型
     * @param typeName
     * @return
     */
    ItemType getItemTypeByItemName(String typeName);

    /**
     * 通过类型ID查找类型
     * @return
     */
    ItemType getItemIdByTypeId(Integer typeId);
}
