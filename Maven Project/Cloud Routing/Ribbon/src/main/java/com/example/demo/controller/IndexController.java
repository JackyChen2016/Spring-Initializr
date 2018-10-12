package com.example.demo.controller;

import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    @GetMapping(value = "/")
    public String Index() {
        return indexService.Index();
    }
}
