package com.wang.spring.aspectj.anno;

/**
 * Created by wang on 2018/1/18.
 */
public class NeedTestService {
    @NeedTest(value = true)
    public void deleteUser(){

    }

    @NeedTest(value = false)
    public void deleteStudent(){

    }
}
