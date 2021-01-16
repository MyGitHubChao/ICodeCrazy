package com.demo.web;

import com.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    User user;

    @RequestMapping("/test")
    public  void test(){
        System.out.println(user);
    }

}
