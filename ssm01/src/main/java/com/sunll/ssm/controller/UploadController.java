package com.sunll.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/11 10:58
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("uploadPic")
    public void uploadPic(HttpServletRequest request, String fileName, PrintWriter out){
        //把request墙砖为多部件请求对象
        MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
        //根据文件名称获取文件对象
        CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
        //获取文件上传流
        byte[] fbytes = cm.getBytes();

        //文件名称在服务器有可能重复
        String newFileName = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        newFileName = sdf.format(new Date());
        Random r = new Random();
        for(int i = 0; i < 3; i++){
            newFileName = newFileName + r.nextInt(10);
        }
        //获取文件扩展名
        String originalFileName = cm.getOriginalFilename();
        String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));

        //创建jersey服务器，进行跨服务器上传

    }
}
