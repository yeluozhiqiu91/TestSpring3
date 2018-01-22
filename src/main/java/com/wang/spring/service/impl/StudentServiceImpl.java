package com.wang.spring.service.impl;

import com.wang.spring.dao.StudentDao;
import com.wang.spring.model.Student;
import com.wang.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang on 2018/1/22.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }
}
