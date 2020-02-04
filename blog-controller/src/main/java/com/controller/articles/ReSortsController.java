package com.controller.articles;


import com.domain.articles.ReSorts;
import com.domain.articles.WangEditor;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.articles.ReSortsService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description: 分类控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "SortsController", value = "分类", produces = APPLICATION_JSON_VALUE)
@RequestMapping(path = "/home")
public class ReSortsController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(com.controller.articles.ReArticlesController.class);

    //注入业务层
    @Autowired
    ReSortsService reSortsService;

    @GetMapping(name = "分类的分页模糊查询API" , value="/SortsPagingFuzzyQuery")
    public PageInfo<ReSorts> querySortsByParamPages(int pageNum, int pageSize , String sortName) {
        PageHelper.startPage(pageNum,pageSize);
        List<ReSorts> list = reSortsService.SortsPagingFuzzyQuery(sortName);
        PageInfo<ReSorts> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}