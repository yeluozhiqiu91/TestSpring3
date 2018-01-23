package com.wang.spring.controller;

import com.wang.spring.model.Student;
import com.wang.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by wang on 2018/1/19.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/findAllStudents")
    @ResponseBody
    public String findAllStudents(){
        List<Student> students=studentService.findAllStudent();
        StringBuffer sb=new StringBuffer();
        for(Student s:students){
            sb.append(s.toString());
        }
        return sb.toString();
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(Student student){
        try{
            studentService.addStudent(student);
            return "增加成功";
        }catch (Exception e){
            e.printStackTrace();
            return "增加失败";
        }

    }
    @RequestMapping("/testRedis")
    @ResponseBody
    public String testRedis(){
        redisTemplate.opsForValue().set("hello","world",100, TimeUnit.SECONDS);
        String value= (String) redisTemplate.opsForValue().get("hello");
        return value;
    }
}
