package com.service.user;

import com.domain.user.ReUsers;

/**
* @Description: 用户业务逻辑层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

public interface ReUsersService {
    /**
     * 注册
     * @param umsAdminParam 注册参数
     * @return
     */
    public String register(ReUsers umsAdminParam);

    /**
     * 登录
     * @param email 邮箱
     * @param password 密码
     * @param uid 用户主键，登录时物用，提供给注册调用的,登陆时默认传递0
     * @return
     */
    public String login(String email, String password, long uid);
}