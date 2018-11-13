package com.saas.boot1.saasboot.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MyFilter1",urlPatterns = "/*")
/*
@WebFilter时Servlet3.0新增的注解，原先实现过滤器，需要在web.xml中进行配置，而现在通过此注解，
启动启动时会自动扫描自动注册。
但当注册多个过滤器时，无法指定执行顺序的，原本使用web。xml配置过滤器时，是可指定执行顺序的，
但使用@WebFilter时，没有这个配置属性的(需要配合@Order进行)
*/
@Slf4j
@Order(value = 5)
public class MyFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter1 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        log.info("doFilter1 请求处理");
        //对request、response进行一些预处理
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");
        // response.setCharacterEncoding("UTF-8");
        //TODO 进行业务逻辑

        //链路 直接传给下一个过滤器
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");
    }
}
