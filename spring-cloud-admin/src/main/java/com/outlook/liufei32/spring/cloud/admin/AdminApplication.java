package com.outlook.liufei32.spring.cloud.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: AdminApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/5 12:38
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminApplication {

    public static void main( String[] args ) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
