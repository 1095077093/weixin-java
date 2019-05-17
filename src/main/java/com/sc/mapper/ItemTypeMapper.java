package com.sc.mapper;

import com.sc.entity.Item;
import com.sc.entity.ItemType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemTypeMapper {
    /**
     * 获取类型列表
     * @return
     */
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
