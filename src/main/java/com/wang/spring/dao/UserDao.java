package com.wang.spring.dao;

import com.wang.spring.model.db.Users;

/**
 * Created by wang on 2018/4/11.
 */
public interface UserDao {
    public Users getUserByUserName(String userName);
}
