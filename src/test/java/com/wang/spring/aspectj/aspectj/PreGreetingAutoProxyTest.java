package com.wang.spring.aspectj.aspectj;

import com.wang.spring.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/1/18.
 * 配置文件中加了<aop:aspectj-autoproxy/>，他会自动扫描加了@Aspect注解的pojo把他当成一个切面，然后自动为那些被代理的bean创建代理
 */
public class PreGreetingAutoProxyTest {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter waiter= (Waiter) app.getBean("waiter");
        waiter.greetTo("Tom");
        waiter.serveTo("Tom");
    }
}
