package com.emergency.rescue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序
 *
 * @author lihexiao
 * @create 2018-03-28 15:39:01
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.emergency.rescue"})
public class AdminApplication {
    public static void main(String[] args){
        SpringApplication.run(AdminApplication.class,args);
    }
}
