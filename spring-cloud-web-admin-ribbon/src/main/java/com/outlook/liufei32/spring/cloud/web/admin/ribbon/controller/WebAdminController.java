package com.outlook.liufei32.spring.cloud.web.admin.ribbon.controller;

import com.outlook.liufei32.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: WebAdminController
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 13:34
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@RestController
public class WebAdminController {

    @Autowired
    private AdminService adminService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}
