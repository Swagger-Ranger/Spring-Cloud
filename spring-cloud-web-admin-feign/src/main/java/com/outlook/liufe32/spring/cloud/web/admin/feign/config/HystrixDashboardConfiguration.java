package com.outlook.liufe32.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: HystrixDashboardConfiguration
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/3 17:32
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@Configuration
public class HystrixDashboardConfiguration {


    /**
     * 传统new servlet就是新建一个类继承httpServlet然后配置xml，但springboot没有xml配置所有springboot中配置servlet就是
     * configuration+bean的注解方式
     * 1.新建一个servlet
     * 2.使用springboot的注册bean：ServletRegistrationBean，注册servlet
     * 3.配置servlet的属性：
     *                    启动顺序setLoadOnStartup(1)，
     *                    访问路径：addUrlMappings("/hystrix.stream")，
     *                    servlet名：setName("HystrixMetricsStreamServlet")
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
