package com.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  角色实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}