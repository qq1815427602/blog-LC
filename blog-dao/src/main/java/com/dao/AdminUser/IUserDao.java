package com.dao.AdminUser;

import com.domain.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    AdminUser findByUserEmail(String email);
}
