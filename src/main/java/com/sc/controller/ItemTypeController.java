package com.sc.controller;

import com.sc.entity.ItemType;
import com.sc.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemTypeController {

    @Autowired
    private ItemTypeService itemTypeService;

    @GetMapping(value = "/getItemType")
    public List<ItemType> getItemType(){
        List<ItemType> itemTypeList = itemTypeService.getItemTypeList();
        return itemTypeList;
    }
}
