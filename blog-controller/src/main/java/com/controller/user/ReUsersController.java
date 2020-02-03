package com.controller.user;

import com.common.response.GenericResponse;
import com.common.response.ResponseFormat;
import com.domain.user.ReUsers;
import com.domain.user.RegisterModel;
import com.service.user.ReUsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
* @Description: 用户控制器接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@RestController
@Api(tags = "HomeController", value = "主页", produces = APPLICATION_JSON_VALUE)
@RequestMapping("/home")
public class ReUsersController {

    //获取数据类型
    private static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

    //创建控制器日志对象
    private static final Logger ReArticlesController = LoggerFactory.getLogger(com.controller.articles.ReArticlesController.class);

    //注入业务层
    @Autowired
    ReUsersService reUsersService;

    @ApiOperation(value = "登录")
    @ApiResponses({
            @ApiResponse(code = 200,message = "登录成功"),
            @ApiResponse(code = 401,message = "账号或者密码错误")
    })
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public GenericResponse login(@RequestBody RegisterModel loginModel) {
        String token = reUsersService.login(loginModel.getUserEmail(), loginModel.getUserPassword(),0);
        if (token == null) {
            return ResponseFormat.retParam(401, "");
        }
        return ResponseFormat.retParam(200, token);
    }

    @ApiOperation(value = "注册")
    @ApiResponses({
            @ApiResponse(code = 200,message = "登录成功"),
            @ApiResponse(code = 401,message = "账号已被注册")
    })
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public GenericResponse register(@RequestBody RegisterModel registerModel) {
        ReUsers reUsers = new ReUsers();
        reUsers.setUserPassword(registerModel.getUserPassword());
        reUsers.setUserEmail(registerModel.getUserEmail());
        String token = reUsersService.register(reUsers);
        if (token==null){
            return ResponseFormat.retParam(401, "账号已被注册");
        }
        return ResponseFormat.retParam(200, token);
    }
}