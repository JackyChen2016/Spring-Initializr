package com.example.demo.controller;

import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return indexService.index();
    }
}
