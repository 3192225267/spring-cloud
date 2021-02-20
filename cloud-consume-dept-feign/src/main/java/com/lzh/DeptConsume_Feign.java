package com.lzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.lzh")
@EnableFeignClients(basePackages = {"com.lzh"})

public class DeptConsume_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsume_Feign.class,args);
    }
}
