package com.security.component;

import com.common.jwt.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT登录授权过滤器
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    private static Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
    @Autowired
    @Qualifier("userDetailsServiceImpl")
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {
        String authHeader=request.getHeader(this.tokenHeader);
        //判断 jwt 中 header 的Authorization 是否为空并且是否以 Bearer 开头
        if (authHeader!=null&&authHeader.startsWith(this.tokenHead)){
            //将 Bearer 去除
            String authToken=authHeader.substring(this.tokenHead.length());
            String email =jwtTokenUtil.getEmailFromToken(authToken);
            LOGGER.info("checking username:{}", email);
            if (email != null & SecurityContextHolder.getContext().getAuthentication() == null) {
                //判断用户是否存在
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(email);
                //验证token是否还有效
                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                    UsernamePasswordAuthenticationToken authenticationToken =
                            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    LOGGER.info("authenticated user:{}", email);
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        }
        //这个作用不太清楚
        chain.doFilter(request,response);
    }
}












