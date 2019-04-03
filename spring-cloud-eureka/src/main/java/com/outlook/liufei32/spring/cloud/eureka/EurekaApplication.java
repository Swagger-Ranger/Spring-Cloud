package com.outlook.liufei32.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: EurekaApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 12:52
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main( String[] args ) {
            SpringApplication.run(EurekaApplication.class, args);
    }
}
