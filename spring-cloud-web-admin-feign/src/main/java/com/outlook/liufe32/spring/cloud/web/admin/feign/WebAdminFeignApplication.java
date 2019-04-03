package com.outlook.liufe32.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: WebAdminFeignApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 15:35
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class WebAdminFeignApplication {

    public static void main( String[] args ) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
