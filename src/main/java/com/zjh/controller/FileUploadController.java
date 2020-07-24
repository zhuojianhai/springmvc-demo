package com.zjh.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileUploadController {


    /***
     * springmvc 方式完成文件上传
     * @param request
     * @param upload
     * @return
     * @throws IOException
     */
    @RequestMapping("/upload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("spring mvc fileUpload2 >>>>>>>>>>>>>>>>>>>>>>>");
        //获得项目部署后的真实的盘符
        String filePath = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断文件上传的文件夹是否存在
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }


        //获得文件名称
        String filename = upload.getOriginalFilename();

        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;
        // 完成文件上传
        upload.transferTo(new File(filePath,filename));
        return "success";
    }

    /**
     * 传统方式完成文件上传，需要借助apache 文件上传的组件
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/upload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("fileUpload1 >>>>>>>>>>>>>>>>>>>>>>>");

        //获得项目部署后的真实的盘符
        String filePath = request.getSession().getServletContext().getRealPath("/uploads/");
        String path = request.getSession().getServletContext().getContextPath();
        System.out.println("filePath---"+filePath);
        System.out.println("path----"+path);

        //判断文件上传的文件夹是否存在
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }
        // 解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 解析request
       List<FileItem> fileItems =  upload.parseRequest(request);

        // 遍历
        for(FileItem item:fileItems){
            // 进行判断，当前item对象是否是上传文件项
            if(item.isFormField()){
                // 说明普通表单向
            }else{
                // 说明上传文件项
                // 获取上传文件的名称
                String filename = item.getName();
                // 把文件的名称设置唯一值，uuid
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid+"_"+filename;
                // 完成文件上传,将文件上传到当前项目的uploads 目录中
                item.write(new File(filePath,filename));
                // 删除临时文件
                item.delete();
            }
        }



        return "success";

    }

}
