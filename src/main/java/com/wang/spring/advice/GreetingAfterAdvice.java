package com.wang.spring.advice;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by wang on 2018/1/18.
 * 后置增强
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String clientNmae=(String)objects[0];
        System.out.println("Enjoy youself,Mr."+clientNmae+".");
    }
}
