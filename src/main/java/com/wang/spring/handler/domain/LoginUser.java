package com.wang.spring.handler.domain;


import com.wang.spring.model.db.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Date;

public class LoginUser extends User {
    private static final long serialVersionUID = 1919464185097508773L;

    private Users user;

    public LoginUser(String username, String password, boolean enabled, boolean accountNonExpired,
                     boolean credentialsNonExpired, boolean accountNonLocked, Collection<GrantedAuthority> authorities)
            throws IllegalArgumentException {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public String getName() {
        return getUser().getName();
    }

    public String getEmail() {
        return getUser().getEmail();
    }

    public String getPhone() {
        return getUser().getPhone();
    }

    public String getApikey() {
        return getUser().getApikey();
    }

    public Date getCreatedAt() {
        return getUser().getCreatedAt();
    }

    public Date getUpdatedAt() {
        return getUser().getUpdatedAt();
    }

    public Integer getRole() {
        return getUser().getRole();
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public static LoginUser getCurrentLoginUser() {
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            if ("anonymousUser".equals(SecurityContextHolder.getContext().getAuthentication().getPrincipal())) {
                return null;
            }

            return (LoginUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }

        return null;
    }

}
