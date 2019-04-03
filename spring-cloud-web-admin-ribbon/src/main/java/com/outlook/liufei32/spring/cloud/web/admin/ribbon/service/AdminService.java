package com.outlook.liufei32.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: AdminService
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 13:31
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi( String message ) {
        return restTemplate.getForObject("http://SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }

    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
