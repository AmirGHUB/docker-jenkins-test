package com.jenkinstest.take1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String getSomeText(){
        return "Hope this is working";
    }
}
