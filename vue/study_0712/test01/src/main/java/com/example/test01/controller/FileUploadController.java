package com.example.test01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    // 获取当前目录的绝对目录
    private static final String UPLOADED_FOLDER = System.getProperty("user.dir")+"/upload/";
    @PostMapping("/upload")
    public String upload(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        // 打印当前文件大小
        System.out.println("文件大小"+photo.getSize());
        // 打印当前文件类型
        System.out.println(photo.getContentType());
        // 打印当前文件的属性
        System.out.println(System.getProperty("user.dir"));
        // 打印原始文件名称
        System.out.println(photo.getOriginalFilename());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo);
        return "上传成功";
    }
    public void saveFile(MultipartFile f) throws IOException {
        File upDir = new File(UPLOADED_FOLDER);
        if (!upDir.exists()) {
            upDir.mkdir();
        }
        File file = new File(UPLOADED_FOLDER+f.getOriginalFilename());
        // 上传文件
        f.transferTo(file);
    }

}
