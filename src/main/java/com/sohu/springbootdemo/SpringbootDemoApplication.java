package com.sohu.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.util.UrlPathHelper;


//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //默认8080
@MapperScan("com.sohu.springbootdemo") //自动扫描
@ServletComponentScan(basePackages = {"com.sohu.springbootdemo.Filter"})
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }



}
