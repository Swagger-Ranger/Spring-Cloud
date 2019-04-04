package com.outlook.liufei32.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: ZuulApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 23:38
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

    public static void main( String[] args ) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
