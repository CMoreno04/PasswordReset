package com.passwordreset.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Slf4j
@RequestMapping("api/")
@CrossOrigin({ "**","http://localhost:4277" })
public class HomeController {


    @GetMapping(value="path")
    public String getMethodName(@RequestParam String param) {
        return "it works";
    }
    
}
