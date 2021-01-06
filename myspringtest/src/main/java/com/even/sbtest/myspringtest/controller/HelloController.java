package com.even.sbtest.myspringtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id) {
        String s = "222";
        String s2 = "AAA";
        return s + "hello spring boot ！！！" + id + s2;
    }


}
