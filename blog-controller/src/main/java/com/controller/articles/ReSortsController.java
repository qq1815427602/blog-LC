package com.controller.articles;


import com.common.response.GenericResponse;
import com.common.response.ResponseFormat;
import com.domain.articles.ReSorts;
import com.domain.articles.ReSorts;
import com.domain.articles.WangEditor;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.articles.ReSortsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "分类的分页模糊查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "查询成功"),
    })
    @RequestMapping(name = "分类的分页模糊查询" , value="/SortsPagingFuzzyQuery" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse SortsPagingFuzzyQuery(int pageNum, int pageSize , ReSorts reSorts) {
        PageHelper.startPage(pageNum,pageSize);
        List<ReSorts> list = reSortsService.SortsPagingFuzzyQuery(reSorts);
//        PageInfo<ReSorts> pageInfo = new PageInfo<>(list);

        return ResponseFormat.retParam(200,list);
    }

    @ApiOperation(value = "删除分类")
    @ApiResponses({
            @ApiResponse(code = 200,message = "删除成功"),
            @ApiResponse(code = 500,message = "删除失败")
    })
    @RequestMapping(name = "删除分类" , value = "/deleteSorts" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse deleteSorts(ReSorts reSorts) {

        int judge = reSortsService.deleteSorts(reSorts);

        if (judge > 0){
            return ResponseFormat.retParam(200,"删除分类成功");
        }

        return ResponseFormat.retParam(500,"删除分类失败");

    }

    @ApiOperation(value = "添加分类")
    @ApiResponses({
            @ApiResponse(code = 200,message = "添加成功"),
            @ApiResponse(code = 500,message = "添加失败")
    })
    @RequestMapping(name = "添加分类" , value = "/addSorts" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse addSorts(ReSorts reSorts) {

        int judge = reSortsService.addSorts(reSorts);

        if (judge > 0){
            return ResponseFormat.retParam(200,"添加分类成功");
        }

        return ResponseFormat.retParam(500,"添加分类失败");

    }

    @ApiOperation(value = "修改分类")
    @ApiResponses({
            @ApiResponse(code = 200,message = "修改成功"),
            @ApiResponse(code = 500,message = "修改失败")
    })
    @RequestMapping(name = "修改分类" , value = "/updateSorts" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse updateSorts(ReSorts reSorts) {

        int judge = reSortsService.updateSorts(reSorts);

        if (judge > 0){
            return ResponseFormat.retParam(200,"修改分类成功");
        }

        return ResponseFormat.retParam(500,"修改分类失败");

    }



}