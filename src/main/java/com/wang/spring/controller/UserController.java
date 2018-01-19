package com.wang.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang on 2018/1/19.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
