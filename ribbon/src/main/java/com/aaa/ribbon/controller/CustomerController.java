package com.aaa.ribbon.controller;

import com.aaa.ribbon.service.ComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    ComputerService computerService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(Integer a,Integer b){
        return computerService.add(a, b);
    }
}
