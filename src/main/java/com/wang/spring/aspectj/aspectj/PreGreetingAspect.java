package com.wang.spring.aspectj.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wang on 2018/1/18.
 */
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void BeforeGreeting(){
        System.out.println("How are you");
    }
}
