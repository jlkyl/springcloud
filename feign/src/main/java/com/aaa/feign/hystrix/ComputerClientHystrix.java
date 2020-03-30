package com.aaa.feign.hystrix;

import com.aaa.feign.feignclient.ComputerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputerClientHystrix implements ComputerClient {

    @Override
    public Integer add(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
        return -9999;
    }
}
