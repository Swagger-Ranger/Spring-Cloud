package com.outlook.liufe32.spring.cloud.web.admin.feign.service.hystrix;

import com.outlook.liufe32.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: AdminServiceHystrix
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 17:00
 * @Description:  feign熔断器对于接口的实现类
 * @Aha-eureka:
 *******************************************************************************/

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi( String message ) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
