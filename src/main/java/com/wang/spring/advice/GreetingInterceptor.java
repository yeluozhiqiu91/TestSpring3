package com.wang.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wang on 2018/1/18.
 * 环绕增强
 */
public class GreetingInterceptor implements MethodInterceptor{
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] objects=methodInvocation.getArguments();//获得入参
        String clientName=(String)objects[0];
        System.out.println("How are you ,Mr. "+clientName);//前置逻辑
        Object obj=methodInvocation.proceed();
        System.out.println("Enjoy yourself,Mr. "+clientName);//后置逻辑
        return obj;
    }
}
