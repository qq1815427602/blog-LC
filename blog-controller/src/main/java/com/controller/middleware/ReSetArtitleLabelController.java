package com.controller.middleware;

import com.service.middleware.ReSetArtitleLabelService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description:  帖子所属标签控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "ArtitleLabelController", value = "帖子所属标签", produces = APPLICATION_JSON_VALUE)
@RequestMapping(path = "/ReSetArtitleLabel")
public class ReSetArtitleLabelController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(com.controller.articles.ReArticlesController.class);

    //注入业务层
    @Autowired
    ReSetArtitleLabelService reSetArtitleLabelService;

}