package com.sohu.springbootdemo.Filter;


import com.sohu.springbootdemo.controller.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author haochen
 * @date 2019/7/26 16:17
 * 过滤器不在启动器的扫描范围，必须手动添加
 * @ServletComponentScan(basePackages = {"com.sohu.springbootdemo.Filter"})
 */
//@Configuration
@WebFilter(filterName = "urlfilter",urlPatterns = "/test/success/*")
public class UrlFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(UrlFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("----------------------->过滤器被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestURI = req.getRequestURI();
        logger.info("--------------------->过滤器：请求地址"+requestURI);
        if(!requestURI.contains("info")&&!requestURI.contains("druid")){
            servletRequest.getRequestDispatcher("/test/failed").forward(servletRequest, servletResponse);
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        logger.info("----------------------->过滤器被销毁");
    }
}
