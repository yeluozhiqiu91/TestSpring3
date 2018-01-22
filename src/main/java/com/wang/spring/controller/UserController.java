package com.wang.spring.controller;

import com.wang.spring.model.Student;
import com.wang.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wang on 2018/1/19.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/findAllStudents",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findAllStudents(){
        List<Student> students=studentService.findAllStudent();
        StringBuffer sb=new StringBuffer();
        for(Student s:students){
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
