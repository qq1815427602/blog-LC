package com.domain.middleware;

import java.io.Serializable;

/**
* @Description:  用户所属角色实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
public class ReSetUsersRole implements Serializable {
    /**
     * 编号ID
     */
    private Long usersRoleId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 用户ID
     */
    private Long userId;

    private static final long serialVersionUID = 1L;

    public Long getUsersRoleId() {
        return usersRoleId;
    }

    public void setUsersRoleId(Long usersRoleId) {
        this.usersRoleId = usersRoleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}