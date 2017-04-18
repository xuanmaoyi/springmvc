package com.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by maoyi.xuan on 2017/4/18.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.springmvc")
public class springmvcConfig {
    @Bean
    InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setViewClass(JstlView.class);
        return  viewResolver;
    }
}
