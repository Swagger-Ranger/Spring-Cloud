package com.outlook.liufei32.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: ServiceAdminApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 13:17
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {

    public static void main( String[] args ) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
