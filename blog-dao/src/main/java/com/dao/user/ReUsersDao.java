package com.dao.user;

import com.domain.user.ReUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @Description: 用户数据访问层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@Repository
@Mapper
public interface ReUsersDao {
    /**
     * 通过邮箱查询用户
     * @param email
     * @return
     */
    ReUsers findByUserEmail(String email);

    /**
     * 用户注册
     * @param reUsers
     * @return
     */
    Integer registeredUser(ReUsers reUsers);
}