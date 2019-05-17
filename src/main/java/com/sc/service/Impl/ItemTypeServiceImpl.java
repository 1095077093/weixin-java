package com.sc.service.Impl;

import com.sc.entity.ItemType;
import com.sc.mapper.ItemTypeMapper;
import com.sc.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ItemTypeServiceImpl implements ItemTypeService {

    @Autowired
    private ItemTypeMapper itemTypeMapper;
    @Override
    public List<ItemType> getItemTypeList() {
        return itemTypeMapper.getItemTypeList();
    }

    @Override
    public ItemType getItemTypeByItemName(String typeName) {
        return itemTypeMapper.getItemTypeByItemName(typeName);
    }

    @Override
    public ItemType getItemIdByTypeId(Integer typeId) {
        return itemTypeMapper.getItemIdByTypeId(typeId);
    }


}
