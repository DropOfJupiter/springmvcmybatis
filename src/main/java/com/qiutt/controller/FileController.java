package com.qiutt.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/file")
public class FileController {
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam(value="myfiles",required=true) MultipartFile[] myfiles,HttpServletRequest request) {
		 for(MultipartFile file : myfiles){     
	            //此处MultipartFile[]表明是多文件,如果是单文件MultipartFile就行了  
	            if(file.isEmpty()){   
	                System.out.println("文件未上传!");  
	            }else{  
		                //得到上传的文件名  
		                String fileName = file.getOriginalFilename();  
		                //得到服务器项目发布运行所在地址  
		                //String path  = request.getSession().getServletContext().getRealPath("WEB-INF/upload")+File.separator;  
		                String path=request.getSession().getServletContext().getRealPath("WEB-INF")+"/upload/"+ new SimpleDateFormat("yyyyMMdd").format(new Date());		                
		                //此处未使用UUID来生成唯一标识,用日期做为标识  
		                String filePath = path+ "/"+fileName;  
		                //查看文件上传路径,方便查找  
		                System.out.println(filePath);  
		                //把文件上传至path的路径  
		                File localFile = new File(filePath);  
		                if(!localFile.exists()){  
		                	localFile.mkdirs();  
		                } 
		                try {
							file.transferTo(localFile);
						} catch (IllegalStateException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return "error";
						}  
	                }  
	            }  
	        return "success";
	}
}
