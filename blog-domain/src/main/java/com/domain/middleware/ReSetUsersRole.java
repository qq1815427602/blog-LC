package com.domain.middleware;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
* @Description:  用户所属角色实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}