package com.practice.openshift.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstService {
    @RequestMapping("/")
    @ResponseBody
    public String printHello() {
        return "Hello World";
    }
}
