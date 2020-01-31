package com.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  角色实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
public class ReRoles implements Serializable {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 父级角色ID
     */
    private Long parentRoleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 创建时间
     */
    private Date roleCreatetime;

    /**
     * 角色描述
     */
    private String roleDescription;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getParentRoleId() {
        return parentRoleId;
    }

    public void setParentRoleId(Long parentRoleId) {
        this.parentRoleId = parentRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getRoleCreatetime() {
        return roleCreatetime;
    }

    public void setRoleCreatetime(Date roleCreatetime) {
        this.roleCreatetime = roleCreatetime;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public ReRoles(Long roleId, Long parentRoleId, String roleName, Date roleCreatetime, String roleDescription) {
        this.roleId = roleId;
        this.parentRoleId = parentRoleId;
        this.roleName = roleName;
        this.roleCreatetime = roleCreatetime;
        this.roleDescription = roleDescription;
    }

    public ReRoles() {
    }
}