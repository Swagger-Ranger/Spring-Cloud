package com.outlook.liufei32.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: WebAdminRibbonApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 13:26
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WebAdminRibbonApplication {

    public static void main( String[] args ) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
