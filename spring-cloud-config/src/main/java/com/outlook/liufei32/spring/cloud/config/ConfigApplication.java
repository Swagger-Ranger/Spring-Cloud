package com.outlook.liufei32.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: ConfigApplication
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/4 18:55
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigApplication {

    public static void main( String[] args ) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
