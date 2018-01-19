package com.wang.spring.aspectj.aspectj;

import com.wang.spring.advice.NativeWaiter;
import com.wang.spring.advice.Waiter;
import com.wang.spring.aspectj.aspectj.PreGreetingAspect;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by wang on 2018/1/18.
 */
public class PreGreetingTest {
    public static void main(String[] args) {
        Waiter waiter=new NativeWaiter();
        AspectJProxyFactory proxyFactory=new AspectJProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAspect(PreGreetingAspect.class);
        Waiter waiterProxy=(Waiter)proxyFactory.getProxy();
        waiterProxy.greetTo("John");
        waiterProxy.serveTo("John");
    }
}
