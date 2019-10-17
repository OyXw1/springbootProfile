package com.test.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${name}")
    private String name;
    @RequestMapping("hi")
    public String hi(){
        return name;
    }

}
