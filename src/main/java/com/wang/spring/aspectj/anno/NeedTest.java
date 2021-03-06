package com.wang.spring.aspectj.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wang on 2018/1/18.
 */
@Retention(RetentionPolicy.RUNTIME)//声明注解的保留期限
@Target(ElementType.METHOD)         //声明可以使用该注解的目标类型
public @interface NeedTest {        //定义注解
    boolean value() default true;
}
