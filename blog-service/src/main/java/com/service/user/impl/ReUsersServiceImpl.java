package com.service.user.impl;

import com.common.jwt.JwtTokenUtil;
import com.dao.user.ReRolesDao;
import com.dao.user.ReUsersDao;
import com.domain.user.ReUsers;
import com.service.user.ReUsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description: 用户业务逻辑层接口实现
 * @Author: 夜空
 * @Date: 2020/1/29
 */

@Service
public class ReUsersServiceImpl implements ReUsersService {
    @Autowired
    @Qualifier("userDetailsServiceImpl")
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private ReUsersDao usersDao;

    @Autowired
    private ReRolesDao roleDao;

    @Override
    public String register(ReUsers reUsersParam) {
        ReUsers userExit=usersDao.findByUserEmail(reUsersParam.getUserEmail());
        //判断该邮箱是否已经存在
        if (userExit!=null){
            return null;
        }
        String oldPassword=reUsersParam.getUserPassword();
        String encodePassword=passwordEncoder.encode(reUsersParam.getUserPassword());
        reUsersParam.setUserState(1);
        reUsersParam.setUserProfilePhoto("https://cn.vuejs.org/images/logo.png");
        reUsersParam.setUserPassword(encodePassword);
        int uid=usersDao.registeredUser(reUsersParam);
        if (uid==0){
            return null;
        }
        roleDao.roleBind(reUsersParam.getUserId(),1);
        return login(reUsersParam.getUserEmail(),oldPassword,uid);
    }

    @Override
    public String login(String email, String password, long uid) {
        String token;
        try {
            UserDetails userDetails=userDetailsService.loadUserByUsername(email);
            if (!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            //这个 if 要优化下，因为我想把 id 加进去，以后直接取 id ，sql 语句会好写很多
            if (uid==0){
                ReUsers umsAdmin=usersDao.findByUserEmail(email);
                uid=umsAdmin.getUserId();
            }
            token=jwtTokenUtil.generateToken(userDetails,uid);
        }catch (AuthenticationException e){
            return null;
        }
        return token;
    }
}