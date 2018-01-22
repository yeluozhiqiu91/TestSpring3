package com.wang.spring.dao;

import com.wang.spring.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wang on 2018/1/22.
 */
@Repository
public interface StudentDao {
    List<Student> findAllStudent();
    void addStudent(Student student);
    void updateStudent(Student student);
}
