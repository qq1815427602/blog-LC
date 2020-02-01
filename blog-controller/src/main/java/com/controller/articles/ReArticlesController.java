package com.controller.articles;


import com.domain.articles.ReArticles;
import com.domain.articles.WangEditor;
import com.service.articles.ReArticlesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description: 文章控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "ArticlesController", value = "文章", produces = APPLICATION_JSON_VALUE)
@RequestMapping(path = "/ReArticles")
public class ReArticlesController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(ReArticlesController.class);

    //注入业务层
    @Autowired
    ReArticlesService reArticlesService;

    @ApiOperation(value = "文章图片上传")
    @ApiResponses({
            @ApiResponse(code = 0,message = "上传成功"),
    })
    @RequestMapping(name = "文章图片上传接口" , value = "/ReArticlesImagesUpload" , method = RequestMethod.POST)
    public WangEditor ReArticlesImagesUpload(@RequestParam("file") MultipartFile[] file, HttpServletRequest request, HttpSession session) throws IOException {

        //清除上传图片路径缓存
        session.removeAttribute("uploadPath");

        //清除上传图片名称缓存
        session.removeAttribute("uploadCache");

        //图片名称缓存
        List uploadCache = new ArrayList();

        //遍历上传文件
        for (MultipartFile multipartFile : file) {

            //得到上传图片的名称
            String updateFileName = multipartFile.getOriginalFilename();

            //得到上传图片的后缀格式名
            String suffixName = updateFileName.substring(updateFileName.lastIndexOf("."));

            //确定图片上传的服务器路径
            ServletContext servletContext = session.getServletContext();
            String filePath = servletContext.getRealPath("/images");

            //图片上传路径
            File uploadPath = new File(filePath);

            //(如果在程序中没有此文件就创建一个)
            if (!uploadPath.exists()) {
                uploadPath.mkdirs();//创建文件（用来存储上传的文件）
            }

            String fileName = UUID.randomUUID() + suffixName; //新文件名

            uploadPath = new File(uploadPath + "/" + fileName);//文件创建路径

            session.setAttribute("uploadPath",uploadPath);//把路径缓存进入session会话

            System.out.println("uploadPath ：" + uploadPath);//控制台打印缓存路径

            multipartFile.transferTo(uploadPath);//开始上传文件

            String imagesPath = uploadPath.toString();//图片路径传输到前台

            //返回\\在此字符串中最后一次出现处的索引长度，如果此字符串中没有这样的字符，则返回 -1。
            int i = imagesPath.lastIndexOf('\\', (imagesPath.lastIndexOf("\\") - 1));

            //去掉下标长度的字符并重构
            imagesPath = imagesPath.substring(i + 1);

            //把路径存入缓存路径集合
            uploadCache.add(imagesPath);

        }

        session.setAttribute("uploadCache",uploadCache);//把缓存路径集合存入session会话

        String[] strings = new String[uploadCache.size()];//创建一个数组 长度为集合的长度

        uploadCache.toArray(strings);//缓存路径集合的值存入strings数组

        WangEditor wangEditor = new WangEditor(strings);//富文本数据传输对象存入数组路径

        return wangEditor;
    }

   /* @ApiOperation(value = "文章上传")
    @ApiResponses({
            @ApiResponse(code = 0,message = "上传成功"),
    })
    @RequestMapping(name = "文章上传" , value="/textUpload" , method = RequestMethod.POST)
    public Map<String, Object> textUpload(HttpSession session) throws IOException {

        File uploadPath = (File)session.getAttribute("uploadPath");//从session会话取出上传路径

        ReArticles reArticles = new ReArticles();//从前台接受数据 ，构造方法方式存值进入富文本编辑器Bean

        int state = wangeditorSerivce.addWangEditor(wangeditor);//获取添加完数据后的返回值

        if (state == 1){

            List<String> uploadCacheList = (List)session.getAttribute("uploadCache");//从会话缓存中取出值存入集合

            if (uploadCacheList != null){

                //遍历取出上传图片名称
                for(String uploadCache : uploadCacheList){

                    //文件名称
                    String fileName = uploadCache;

                    //上传后的项目路径用于存放用户提交后的内容
                    String location = "F:\\夜空的研究成果\\demo\\src\\main\\resources\\static\\"+fileName;

                    // 获取上传后的路径
                    String FilePath = location;

                    //创建上传路径
                    File newUploadPath = new File(FilePath);

                    //通过 IO 字符流 创建输入流对象 和 输出流对象
                    FileInputStream fis = new FileInputStream(uploadPath);//输入流为缓存中的图片上传集合路径
                    FileOutputStream fos = new FileOutputStream(newUploadPath);//输出流为项目所在地址真实路径 + 当前遍历数据名称

                    //创建出一个字节数组集合
                    byte[] bt = new byte[1024];

                    //读取和写入信息(便读取便写入)
                    while(fis.read(bt) != -1){
                        fos.write(bt);
                    }

                    //关闭输入流 和 输出流 回收资源
                    fos.close();
                    fis.close();

                }

            }
            return ResponseResult.Access_Success_No_Parameter();
        }

        return ResponseResult.Access_Error_No_Parameter();
    }*/

}