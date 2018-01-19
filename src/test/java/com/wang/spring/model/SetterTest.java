package com.wang.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/1/17.
 * 通过setter方法注入属性，相应属性要有setter方法，并且要有一个无参构造方法
 */
public class SetterTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Car car= (Car) applicationContext.getBean("car");
        Car car1=(Car) applicationContext.getBean("car");
        System.out.println(car.toString());
        System.out.println("bean的范围是单实例sigleton吗？："+(car==car1));
    }
}
