package com.wang.spring.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by wang on 2018/1/18.
 */
public class TransactionManagerTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ForumService forumService= (ForumService) app.getBean("forumServiceProxy");
        //forumService.removeForum(2);
        forumService.updateForum(new Forum());
    }
}
