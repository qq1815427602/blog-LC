package com.security.component;

import com.domain.AdminUser;
import com.domain.ReUsers;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

public class AdminUserDetails implements UserDetails {
    private ReUsers user;

    public AdminUserDetails(ReUsers adminUser) {
        this.user = adminUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRolesList().stream()
                .filter(role->role.getRoleName()!=null)
                .map(role->new SimpleGrantedAuthority(role.getRoleName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getUserState()==1;
    }
}