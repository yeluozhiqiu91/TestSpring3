package com.wang.spring.advice;

import java.sql.SQLException;

/**
 * Created by wang on 2018/1/18.
 */
public class ForumService {
    public void removeForum(int forumId){
        throw new RuntimeException("删除论坛运行异常");
    }

    public void updateForum(Forum forum) throws SQLException {
        throw new SQLException("数据更新操作异常。。。");
    }
}
