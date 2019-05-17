package com.sc.mapper;

import com.sc.WxWkyApplicationTests;
import com.sc.entity.ItemType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ItemTypeMapperTest extends WxWkyApplicationTests {

    @Autowired
    private ItemTypeMapper itemTypeMapper;
    @Test
    public void getItemTypeList(){
        List<ItemType> typeList = itemTypeMapper.getItemTypeList();
        System.out.println(typeList);
    }

    @Test
    public void getItemTypeByItemName(){
        ItemType itemType = itemTypeMapper.getItemTypeByItemName("寻物启事");
        System.out.println(itemType);
    }

    @Test
    public void getItemTypeByTypeId(){
        ItemType itemType = itemTypeMapper.getItemIdByTypeId(1000);
        System.out.println(itemType);
    }



}