package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangguilin on 1/2/2018.
 */
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String index(@RequestParam String name){

        return "hello"+name+",this is first message";
    }
}
