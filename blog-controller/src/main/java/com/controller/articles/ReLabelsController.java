package com.controller.articles;


import com.common.response.GenericResponse;
import com.common.response.ResponseFormat;
import com.domain.articles.ReLabels;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.articles.ReLabelsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description:  标签控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "LabelsController", value = "标签", produces = APPLICATION_JSON_VALUE)
@RequestMapping(path = "/Labels")
public class ReLabelsController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(ReArticlesController.class);

    //注入业务层
    @Autowired
    ReLabelsService reLabelsService;

    @ApiOperation(value = "删除标签")
    @ApiResponses({
            @ApiResponse(code = 200,message = "删除成功"),
            @ApiResponse(code = 500,message = "删除失败")
    })
    @RequestMapping(name = "删除标签接口" , value = "/deleteLabels" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse deleteLabels(ReLabels reLabels) {

        int judge = reLabelsService.deleteLabels(reLabels);

        if (judge > 0){
            return ResponseFormat.retParam(200,"删除标签成功");
        }

        return ResponseFormat.retParam(500,"删除标签失败");

    }

    @ApiOperation(value = "添加标签")
    @ApiResponses({
            @ApiResponse(code = 200,message = "添加成功"),
            @ApiResponse(code = 500,message = "添加失败")
    })
    @RequestMapping(name = "添加标签接口" , value = "/addLabels" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse addLabels(ReLabels reLabels) {

        int judge = reLabelsService.addLabels(reLabels);

        if (judge > 0){
            return ResponseFormat.retParam(200,"添加标签成功");
        }

        return ResponseFormat.retParam(500,"添加标签失败");

    }

    @ApiOperation(value = "修改标签")
    @ApiResponses({
            @ApiResponse(code = 200,message = "修改成功"),
            @ApiResponse(code = 500,message = "修改失败")
    })
    @RequestMapping(name = "修改标签接口" , value = "/updateLabels" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse updateLabels(ReLabels reLabels) {

        int judge = reLabelsService.updateLabels(reLabels);

        if (judge > 0){
            return ResponseFormat.retParam(200,"修改标签成功");
        }

        return ResponseFormat.retParam(500,"修改标签失败");

    }

    @ApiOperation(value = "模糊分页查询标签")
    @ApiResponses({
            @ApiResponse(code = 200,message = "响应成功"),
    })
    @RequestMapping(name = "模糊分页查询标签",path = "/pagingFuzzyQueryLabels",method = RequestMethod.POST,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse pagingFuzzyQueryLabels(int pageNum, int pageSize , ReLabels reLabels){

        PageHelper.startPage(pageNum,pageSize);

        List<ReLabels> list = reLabelsService.pagingFuzzyQueryLabels(reLabels);

        PageInfo<ReLabels> pageInfo = new PageInfo<>(list);

        return ResponseFormat.retParam(200,pageInfo);

    }

}