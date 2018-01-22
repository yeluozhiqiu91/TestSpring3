package com.wang.spring.service;

import com.wang.spring.model.Student;

import java.util.List;

/**
 * Created by wang on 2018/1/22.
 */
public interface StudentService {
    List<Student> findAllStudent();
}
