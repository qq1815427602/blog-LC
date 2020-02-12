package com.controller.articles;

import cn.hutool.core.date.DateTime;
import com.common.jwt.JwtTokenUtil;
import com.common.response.GenericResponse;
import com.common.response.ResponseFormat;
import com.domain.articles.ReComments;
import com.domain.articles.ReSorts;
import com.domain.user.ReUsers;
import com.service.articles.ReCommentsService;
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

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description:  评论控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "CommentsController", value = "评论", produces = APPLICATION_JSON_VALUE)
@RequestMapping(path = "/comments")
public class ReCommentsController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(com.controller.articles.ReArticlesController.class);

    //注入业务层
    @Autowired
    ReCommentsService reCommentsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @ApiOperation(value = "获取文章的树形评论")
    @ApiResponses({
            @ApiResponse(code = 200,message = "获取文章的树形评论"),
    })
    @RequestMapping(name = "获取文章的树形评论" , value = "/ArticlesTreeComments" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse ArticlesTreeComments(ReComments Comments) {

        List<ReComments> CommentsTreeMenu = reCommentsService.ArticlesTreeComments(Comments);

        return ResponseFormat.retParam(200,CommentsTreeMenu);
    }

    @ApiOperation(value = "新增评论")
    @ApiResponses({
            @ApiResponse(code = 200,message = "评论成功"),
            @ApiResponse(code = 500,message = "评论失败")
    })
    @RequestMapping(name = "获取文章的树形评论" , value = "/addComments" , method = RequestMethod.POST ,produces = APPLICATION_JSON_UTF8_VALUE)
    public GenericResponse addComments(ReComments reComments) {

        //获取用户Token
        String token = httpServletRequest.getHeader("Authorization").substring("Bearer ".length());

        //获取用户ID
        long userId = (long)jwtTokenUtil.getUserId(token);

        //创建用户对象
        ReUsers reUsers = new ReUsers();

        reUsers.setUserId(userId);

        //把用户对象设置进入文章属性
        reComments.setReUsers(reUsers);

        //获取操作后的状态
        int judge = reCommentsService.addComments(reComments);

        if (judge > 0){
            return ResponseFormat.retParam(200,"评论成功");
        }

        return ResponseFormat.retParam(500,"评论失败");

    }

}