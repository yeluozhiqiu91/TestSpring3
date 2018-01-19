package com.wang.spring.aspectj.anno;

import java.lang.reflect.Method;

/**
 * Created by wang on 2018/1/18.
 */
public class NeedAnnotionTest {
    public static void main(String[] args) {
        Class clazz=NeedTestService.class;
        Method[] methods=clazz.getDeclaredMethods();//得到该类所有方法
        System.out.println(methods.length);
        for(Method method:methods){
            NeedTest needTest=method.getAnnotation(NeedTest.class);//得到方法上的@NeedTest注解
            if(needTest!=null){
                if(needTest.value()){
                    System.out.println(method.getName()+"需要测试");
                }else{
                    System.out.println(method.getName()+"不需要测试");
                }
            }
        }
    }
}
