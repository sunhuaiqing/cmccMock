package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DemoController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/test1")
    public String test(){
        return "test";
    }


    @GetMapping("/user")
    public String testUser() {
        return "userInfo";
    }






}
