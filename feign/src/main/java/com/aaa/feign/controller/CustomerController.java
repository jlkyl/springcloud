package com.aaa.feign.controller;

import com.aaa.feign.feignclient.ComputerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    ComputerClient computerClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(Integer a,Integer b){
        return computerClient.add(a, b);
    }
}
