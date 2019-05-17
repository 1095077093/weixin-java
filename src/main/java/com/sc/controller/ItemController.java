package com.sc.controller;

import com.github.pagehelper.PageInfo;
import com.sc.dto.ItemInfo;
import com.sc.dto.ItemResponse;
import com.sc.dto.ItemUpload;
import com.sc.entity.Item;
import com.sc.entity.ItemType;
import com.sc.entity.User;
import com.sc.service.ItemService;
import com.sc.service.ItemTypeService;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemTypeService itemTypeService;
    @Autowired
    private UserService userService;

    @GetMapping("/getItemInfo")
    public ItemInfo getItemByTypeName(String typeName,Integer pageNo,Integer pageSize){
        ItemType itemType = itemTypeService.getItemTypeByItemName(typeName);
        List<Item> items = itemService.getItemListByTypeId(itemType.getTypeId(), pageNo, pageSize);
        PageInfo<Item> page = new PageInfo<>(items);
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.setHasNext(page.isHasNextPage());
        itemInfo.setPageNo(page.getPageNum());
        itemInfo.setPageSize(page.getPageSize());
        itemInfo.setItems(page.getList());
        return itemInfo;
    }

    @GetMapping("/getItemByItemId")
    public Item getItemByItemId(Integer itemId){
        Item item = itemService.getItemByItemId(itemId);
        return item;
    }

   @GetMapping("/getItemListByUserId")
    public List<Item> getItemListByUserId(Integer userId){
        List<Item> itemList = itemService.getItemListByUserId(userId);
        System.out.println(itemList);
        return  itemList;
    }

    @GetMapping("/deleteItemByItemId")
    public void deleteItemByItemId(Integer itemId){
        itemService.deleteItem(itemId);
    }

    @PostMapping("/addItem")
    public String addItem(@RequestBody ItemUpload itemUpload) throws ParseException {
        System.out.println(itemUpload);
        Item item = new Item();
        //标题
        item.setItemTitle(itemUpload.getItemTitle());
        //user
        User user = userService.getUserByOpenId(itemUpload.getOpenId());
        item.setUser(user);
        //类型
        item.setCategory(itemUpload.getCategory());
        //itemType
        ItemType itemType = itemTypeService.getItemIdByTypeId(itemUpload.getTypeId());
        item.setItemType(itemType);
        //region
        List<String> region = itemUpload.getRegion();
        String region1=region.get(0);
        String region2=region.get(1);
        String region3=region.get(2);
        item.setRegion(region1+"-"+region2+"-"+region3);
        //Address
        item.setAddress(itemUpload.getAddress());
        //LostDetail
        item.setLostDetail(itemUpload.getLostDetail());
        //lostTime
        String lostTime_ = itemUpload.getLostTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date lostTime = dateFormat.parse(lostTime_);
        item.setLostTime(lostTime);
        //Imgs
        item.setImgs(itemUpload.getImgs());

        itemService.addItem(item);
        return "ok";
    }


    @GetMapping("/getItemByItemIdResponse")
    public ItemResponse getItemByItemIdResponse(Integer itemId){
        Item item = itemService.getItemByItemId(itemId);
        ItemResponse itemResponse = new ItemResponse();
        //typeId
        itemResponse.setTypeId(item.getItemType().getTypeId());
        //标题
        itemResponse.setItemTitle(item.getItemTitle());
        //index
        List<ItemType> itemTypeList = itemTypeService.getItemTypeList();
        ItemType itemType = itemTypeService.getItemIdByTypeId(item.getItemType().getTypeId());
        for (int i=0;i<itemTypeList.size();i++){
            if ((itemTypeList.get(i).getTypeId()).equals(itemType.getTypeId())){
                System.out.println(i);
                itemResponse.setIndex(i);
            }
        }
        //种类
        itemResponse.setCategory(item.getCategory());
        //省市区
        String region = item.getRegion();
        String[] strings = region.split("-");
       List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string);
        }
        itemResponse.setRegion(list);
        //详细地址
        itemResponse.setAddress(item.getAddress());
        //时间
        Date lostTime = item.getLostTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String lostTime_ = dateFormat.format(lostTime);
        itemResponse.setLostTime(lostTime_);
        //图片
        itemResponse.setImgs(item.getImgs());
        //失物详情
        itemResponse.setLostDetail(item.getLostDetail());

        return itemResponse;
    }

    @PostMapping("/updateItem")
    public String updateItem(@RequestBody ItemUpload itemUpload) throws ParseException {
        System.out.println(itemUpload);
        Item item = new Item();
        //标题
        item.setItemId(itemUpload.getItemId());
        item.setItemTitle(itemUpload.getItemTitle());
        //user
        User user = userService.getUserByOpenId(itemUpload.getOpenId());
        item.setUser(user);
        //类型
        item.setCategory(itemUpload.getCategory());
        //itemType
        ItemType itemType = itemTypeService.getItemIdByTypeId(itemUpload.getTypeId());
        item.setItemType(itemType);
        //region
        List<String> region = itemUpload.getRegion();
        String region1=region.get(0);
        String region2=region.get(1);
        String region3=region.get(2);
        item.setRegion(region1+"-"+region2+"-"+region3);
        //Address
        item.setAddress(itemUpload.getAddress());
        //LostDetail
        item.setLostDetail(itemUpload.getLostDetail());
        //lostTime
        String lostTime_ = itemUpload.getLostTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date lostTime = dateFormat.parse(lostTime_);
        item.setLostTime(lostTime);
        //Imgs
        item.setImgs(itemUpload.getImgs());

        itemService.updateItem(item);
        return "ok";
    }


}
