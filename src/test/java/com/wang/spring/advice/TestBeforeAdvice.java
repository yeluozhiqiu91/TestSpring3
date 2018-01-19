package com.wang.spring.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by wang on 2018/1/18.
 */
public class TestBeforeAdvice {
    public static void main(String[] args) {
        Waiter waiter=new NativeWaiter();
        BeforeAdvice beforeAdvice=new GreetingBeforeAdvice();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);
        Waiter proxy=(Waiter)proxyFactory.getProxy();
        proxy.greetTo("Tom");
        proxy.serveTo("Tom");
    }
}
