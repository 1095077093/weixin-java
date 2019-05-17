package com.sc.service.Impl;

import com.sc.WxWkyApplicationTests;
import com.sc.entity.ItemType;
import com.sc.service.ItemTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ItemTypeServiceImplTest extends WxWkyApplicationTests {

    @Autowired
    private ItemTypeService itemTypeService;
    @Test
    public void getItemTypeList() {
        List<ItemType> itemTypeList = itemTypeService.getItemTypeList();
        System.out.println(itemTypeList);
    }
}