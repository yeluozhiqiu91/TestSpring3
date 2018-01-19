package com.wang.spring.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by wang on 2018/1/18.
 * ThrowsAdvice标识接口，所以下面这个方法签名必须要像这样写,前面3个参数是可选的，但是要么三个都有，要么三个都没有
 */
public class MyTransactionManager implements ThrowsAdvice{
    public void afterThrowing(Method method,Object[] objects,Object target,Exception ex) throws Throwable{
        System.out.println("-----------");
        System.out.println("method:"+method.getName());
        System.out.println("抛出异常："+ex.getMessage());
        System.out.println("回滚事物操作。。。");
    }
}
