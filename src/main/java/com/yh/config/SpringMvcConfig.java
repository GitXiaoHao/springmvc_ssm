package com.yh.config;

import com.yh.controller.interceptor.ProjectInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 作者 小豪<p>
 * 时间 2022/12/18<p>
 *
 * @author yu<p>
 */
@Configuration//设置映射
@ComponentScan({"com.yh.controller"})//扫描
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor interceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问页面时 走目录下的内容
        registry.addResourceHandler("/html/**").addResourceLocations("/html/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/jquery/**").addResourceLocations("/jquery/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器
        registry.addInterceptor(interceptor).addPathPatterns("/books", "/books/*");
    }
}
