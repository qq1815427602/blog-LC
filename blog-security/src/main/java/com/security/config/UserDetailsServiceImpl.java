package com.security.config;

import com.security.component.AdminUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private ReUsersDao userDao;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        ReUsers user=userDao.findByUserEmail(email);
        if (user==null){
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return new AdminUserDetails(user);
    }
}
