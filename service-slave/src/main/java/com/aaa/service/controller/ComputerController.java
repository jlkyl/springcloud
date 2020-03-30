package com.aaa.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ComputerController {

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public Integer add(Integer a,Integer b){
        Integer r = a + b;
        log.info("/add,a:"+a+",b:"+b+",result:"+r.toString());
        return r;
    }
}
