package com.example.study_swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    // 

    @GetMapping("/test")
    public int[] testGet(){
        int[] array = {1,2,3,4,5};
        return array;
    }
    
}
