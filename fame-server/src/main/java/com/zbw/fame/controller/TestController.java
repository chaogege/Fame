package com.zbw.fame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("appver")
    public String appver() {
        return "SUCCESS !!  time is ==========>  " + new Date().toString();
    }
}
