package com.sc.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sc.entity.Item;
import com.sc.mapper.ItemMapper;
import com.sc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> getItemListByTypeId(Integer typeId, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Item> itemList = itemMapper.getItemListByTypeId(typeId);
        return itemList;
    }

    @Override
    public Item getItemByItemId(Integer itemId) {
        Item item = itemMapper.getItemByItemId(itemId);
        return item;
    }

    @Override
    public void addItem(Item item) {
        itemMapper.addItem(item);
    }

    @Override
    public void updateItem(Item item) {
        itemMapper.updateItem(item);
    }

    @Override
    public void deleteItem(Integer itemId) {
        itemMapper.deleteItem(itemId);

    }
    @Override
    public List<Item> getItemListByUserId(Integer userId) {
        return itemMapper.getItemListByUserId(userId);
    }
}
