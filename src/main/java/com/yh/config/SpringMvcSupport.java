package com.yh.config;

import com.yh.controller.interceptor.ProjectInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author yu
 * @date 2022/12/19
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor interceptor;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问页面时 走目录下的内容
        registry.addResourceHandler("/html/**").addResourceLocations("/html/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/jquery/**").addResourceLocations("/jquery/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //拦截器
        registry.addInterceptor(interceptor).addPathPatterns("/books","/books/*");
    }
}
