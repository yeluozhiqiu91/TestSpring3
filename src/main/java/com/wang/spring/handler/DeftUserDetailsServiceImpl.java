package com.wang.spring.handler;

import com.wang.spring.dao.UserDao;
import com.wang.spring.handler.domain.BadCredentialsEnum;
import com.wang.spring.handler.domain.LoginUser;
import com.wang.spring.model.db.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeftUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    public UserDetails loadUserByUsername(String username) {
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        if (username == null || username.length() == 0) {
            throw new BadCredentialsException(BadCredentialsEnum.USERNAME_IS_REQUIRED.toString());
        }

        Users user = userDao.getUserByUserName(username);

        if (null == user)
            throw new BadCredentialsException(BadCredentialsEnum.USER_IS_NOT_EXIST.toString());

        LoginUser userDetails = new LoginUser(user.getName(), user.getPassword().toLowerCase(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, obtainGrantedAuthorities(Arrays.asList("ROLE_USER")));
        userDetails.setUser(user);

        return userDetails;
    }

    private Set<GrantedAuthority> obtainGrantedAuthorities(List<String> roleList) {
        Set<GrantedAuthority> authSet = new HashSet<>();
        if (roleList != null) {
            for (int i = 0; i < roleList.size(); i++) {
                String roleName = roleList.get(i);
                authSet.add(new SimpleGrantedAuthority(roleName));
            }
        }
        return authSet;
    }

}
