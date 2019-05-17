package com.sc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.UUDecoder;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ImageController {

    @PostMapping("/imageUpload")
    public String imageUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        String filename = file.getOriginalFilename();
        int i = filename.lastIndexOf(".");
        String substring = filename.substring(i);
        System.out.println(substring);
        filename=UUID.randomUUID()+substring;
        String path="D:\\WKY\\image";
        File file1 = new File(path);
        if(!file1.exists()){
            file1.mkdirs();
        }
        //保存到本地服务器
        file.transferTo(new File(file1+"/"+filename));
        //创建返回值
        String returnPath="http://localhost:8888/img/"+filename;
        return returnPath;
    }

}
