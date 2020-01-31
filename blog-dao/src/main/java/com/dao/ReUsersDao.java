package com.dao;

import com.domain.ReUsers;
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
    ReUsers findByUserEmail(String email);
}