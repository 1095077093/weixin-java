package com.sc.service.Impl;

import com.sc.WxWkyApplicationTests;
import com.sc.entity.Item;
import com.sc.entity.ItemType;
import com.sc.entity.User;
import com.sc.service.ItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ItemServiceImplTest extends WxWkyApplicationTests {

    @Autowired
    private ItemService itemService;
    @Test
    public void getItemListByTypeId() {
        List<Item> itemList = itemService.getItemListByTypeId(1001, 1, 1);
        System.out.println(itemList);
    }

    @Test
    public void getItemListByItemId() {
        Item item = itemService.getItemByItemId(1);
        System.out.println(item);
    }

    @Test
    public void addItem() {

        Item item = new Item();
        item.setItemTitle("bbbb");
        User user = new User();
        user.setUserId(1000);
        item.setUser(user);
        item.setCategory("aaa");
        ItemType itemType = new ItemType();
        itemType.setTypeId(1000);
        item.setItemType(itemType);
        item.setRegion("aaaa");
        item.setAddress("aaaa");
        item.setLostTime(new Date());
        ArrayList<String> imgs = new ArrayList<>();
        imgs.add("321.png");
        item.setImgs(imgs);
        item.setLostDetail("sssss");
        itemService.addItem(item);
    }

    @Test
    public void updateItem() {

        Item item = new Item();
        item.setItemId(3);
        item.setItemTitle("cccc");
        User user = new User();
        user.setUserId(1000);
        item.setUser(user);
        item.setCategory("aaa");
        ItemType itemType = new ItemType();
        itemType.setTypeId(1000);
        item.setItemType(itemType);
        item.setRegion("aaaa");
        item.setAddress("aaaa");
        item.setLostTime(new Date());
        ArrayList<String> imgs = new ArrayList<>();
        imgs.add("321.png");
        item.setImgs(imgs);
        item.setLostDetail("sssss");
        itemService.updateItem(item);
    }

    @Test
    public void deleteItem() {
        itemService.deleteItem(3);
    }

    @Test
    public void getItemListByUserId(){
        List<Item> itemList = itemService.getItemListByUserId(1000);
        System.out.println(itemList);
    }
}