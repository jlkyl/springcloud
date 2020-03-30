package com.aaa.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class ComputerService {
    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addFallback") //指定回调方法
    public String add(Integer a,Integer b){
        return restTemplate.getForEntity("http://computer-service/add?a="+a+"&b="+b,String.class).getBody();
    }

    public String addFallback(Integer a,Integer b){
        return "error";
    }
}
