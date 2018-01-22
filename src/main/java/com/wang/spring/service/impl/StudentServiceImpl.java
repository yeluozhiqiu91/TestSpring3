package com.wang.spring.service.impl;

import com.wang.spring.dao.StudentDao;
import com.wang.spring.model.Student;
import com.wang.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);   //有了@Transactional这个注解，抛异常后自动回滚了，没有这个注解的话，数据依然会添加
        throw new RuntimeException();
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
