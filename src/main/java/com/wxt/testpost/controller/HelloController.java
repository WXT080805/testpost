package com.wxt.testpost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name, int age){
        String tempname = name;
        int tempage = age;
        return "美好的事情总是在发生！"+name+age;
    }
}
