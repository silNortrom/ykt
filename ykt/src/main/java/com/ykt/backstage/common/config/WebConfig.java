package com.ykt.backstage.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//CORS过滤的路径，默认：/**
                .allowedOrigins("*")//http://localhost:9527允许跨域的域名，可以用*表示允许任何域名使用
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")//允许任何方法（post、get等）
                .allowedHeaders("*")//允许任何请求头
                .maxAge(3600)//表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
                .allowCredentials(true);//带上cookie信息
    }
}
