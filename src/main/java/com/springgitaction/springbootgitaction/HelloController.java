package com.springgitaction.springbootgitaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("I am controller @Hello");
        System.out.println("I am controller @Hello2345");
        System.out.println("I am controller @Hello2345..");
        System.out.println("I am controller @Hello2345..KKK");
        return "<h1>Hello dear</h1>";
    }


}
