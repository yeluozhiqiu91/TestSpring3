package com.wang.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/1/18.
 */
public class MyDataSourceTest {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyDataSource myDataSource=(MyDataSource)app.getBean("myDataSource");
        System.out.println(myDataSource);
    }
}
