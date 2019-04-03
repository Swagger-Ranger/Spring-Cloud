package com.outlook.liufe32.spring.cloud.web.admin.feign.service;

import com.outlook.liufe32.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: AdminService
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 15:42
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@FeignClient(value = "spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "message") String message );

}
