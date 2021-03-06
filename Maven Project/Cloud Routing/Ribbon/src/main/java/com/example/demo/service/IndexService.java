package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndexService {
    @Autowired
    RestTemplate restTemplate;

    public String Index() {
        return restTemplate.getForObject("http://MVC-DEMO/",String.class);
    }
}
