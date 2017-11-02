package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.example.demo.LcmgrTestScheduler;

public class LcmgrApplication {
    
    @Autowired
    private LcmgrTestScheduler scheduler;
 
    public static void main(String[] args) {
        SpringApplication.run(LcmgrApplication.class, args);
    }
}