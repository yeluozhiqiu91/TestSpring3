package com.wang.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/1/17.
 */
public class BossTest {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Boss boss=(Boss)app.getBean("boss");
        System.out.println(boss);
    }
}
