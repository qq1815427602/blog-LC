package com.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: 角色数据访问层接口
* @Author: 夜空
* @Date: 2020/1/31
*/

@Repository
@Mapper
public interface ReRolesDao {
    /**
     * 绑定用户角色
     * @param userId
     * @param roleId
     */
    int roleBind(@Param("user_id") long userId, @Param("roles_id") Integer roleId);
}