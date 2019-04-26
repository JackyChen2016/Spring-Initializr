package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.config.server.jdbc.sql}")
    private String sql;

    @Value("${jacky.chen}")
    private String name;

    @RequestMapping("/port")
    public String getPort()
    {
        return port + " : " + name + " : " + sql;
    }
}
