package com.controller.articles;


import com.service.articles.ReArticlesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description: 帖子控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@RequestMapping(path = "/ReArticles")
public class ReArticlesController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(ReArticlesController.class);

    //注入业务层
    @Autowired
    ReArticlesService reArticlesService;

}