package com.outlook.liufei32.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: AdminController
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 13:20
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi( String message ) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }
}
