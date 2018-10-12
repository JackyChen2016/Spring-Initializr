package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "MVC-DEMO")
public interface IndexService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String index();
}
