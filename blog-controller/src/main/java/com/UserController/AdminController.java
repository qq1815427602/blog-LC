package com.UserController;

import com.AdminService.IAdminService;
import com.domain.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public AdminUser adminUser(){
        return adminService.getUsers();
    }
    @GetMapping(path = "/test2")
    public String adminUser1(){
        return "hah===";
    }
}
