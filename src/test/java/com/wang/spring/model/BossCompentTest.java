package com.wang.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/1/17.
 */
public class BossCompentTest {
    public static void main(String[] args) {
        //启动容器
        ApplicationContext axt=new ClassPathXmlApplicationContext("applicationContext.xml");
        //关闭容器
        ((ClassPathXmlApplicationContext)axt).destroy();
    }
}
