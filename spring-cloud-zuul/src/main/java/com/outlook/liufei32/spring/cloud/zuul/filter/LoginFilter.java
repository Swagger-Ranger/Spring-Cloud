package com.outlook.liufei32.spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*******************************************************************************
 * @Copyright (C), 2018-2019,github:Swagger-Ranger 
 * @FileName: LoginFilter
 * @Author: liufei32@outlook.com
 * @Date: 2019/4/4 1:08
 * @Description:
 * @Aha-eureka:
 *******************************************************************************/

@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 配置过滤类型，有四种不同生命周期的过滤器类型
     * 1. pre：路由之前
     * 2. routing：路由之时
     * 3. post：路由之后
     * 4. error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 配置过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 配置是否需要过滤：true/需要，false/不需要
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体业务代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        //从请求中获取请求上下文RequestContext
        RequestContext context = RequestContext.getCurrentContext();
        //从上下文中获取HttpServletRequest，就是传统的servlet  HttpServletRequest
        HttpServletRequest request = context.getRequest();

        //获取请求的参数，这里模拟一个请求参数令牌
        String token = request.getParameter("token");

        if (null == token) {
            //如果令牌为空则在zuul的请求中设置不发送请求
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                //从上下文获得response，并设置类型和编码
                HttpServletResponse response = context.getResponse();
                response.setContentType("text/html;charset=utf-8");
                //向请求响应流中写入内容
                response.getWriter().write("非法请求");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
