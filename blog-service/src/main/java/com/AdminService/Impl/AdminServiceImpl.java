package com.AdminService.Impl;

import com.AdminService.IAdminService;
import com.domain.AdminUser;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {
    @Override
    public AdminUser getUsers() {
        AdminUser adminUser=new AdminUser();
        adminUser.setId(1);
        adminUser.setEmail("1045683477@qq.com");
        return adminUser;
    }
}
