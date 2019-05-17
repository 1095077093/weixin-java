package com.sc.mapper;

import com.sc.WxWkyApplicationTests;
import com.sc.entity.Item;
import com.sc.entity.ItemType;
import com.sc.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ItemMapperTest extends WxWkyApplicationTests {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void getItemListByTypeId(){
        List<Item> itemList = itemMapper.getItemListByTypeId(1001);
        System.out.println(itemList);
    }

    @Test
    public void getItemByItemId(){
        Item item = itemMapper.getItemByItemId(1);
        System.out.println(item);
    }




    @Test
    public void addItem(){
        Item item = new Item();
        item.setItemTitle("aaaa");
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
        itemMapper.addItem(item);
    }

    @Test
    public void updateItem(){
        Item item = new Item();
        item.setItemId(2);
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
        itemMapper.updateItem(item);
    }

    @Test
    public void deleteItem(){
        itemMapper.deleteItem(2);
    }

    @Test
   public void getItemListByUserId(){
       List<Item> itemList = itemMapper.getItemListByUserId(1000);
       System.out.println(itemList);
   }


}