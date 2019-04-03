package com.outlook.liufe32.spring.cloud.web.admin.feign.controller;

import com.outlook.liufe32.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: WebAdminController
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 15:44
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/
@RestController
public class WebAdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return adminService.sayHi(message);
    }
}
