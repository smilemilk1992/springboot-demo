package com.sohu.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.util.UrlPathHelper;


//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //默认8080
//@MapperScan("com.sohu.springbootdemo") //全局自动扫描
//@ServletComponentScan(basePackages = {"com.sohu.springbootdemo.Filter"})
@EnableTransactionManagement(proxyTargetClass = true) // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
//@EnableScheduling
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }



}
