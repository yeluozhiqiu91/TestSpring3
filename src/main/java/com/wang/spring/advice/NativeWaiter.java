package com.wang.spring.advice;

/**
 * Created by wang on 2018/1/18.
 */
public class NativeWaiter implements Waiter{
    public void greetTo(String name) {
        System.out.println("greet to "+name+"...");
    }

    public void serveTo(String name) {
        System.out.println("serving to "+name+"...");
    }
}
