package com.lzh;

import com.myrule.LiuRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "springcloud-provider-dept",configuration = LiuRule.class)
public class DeptConsume_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsume_80.class,args);
    }
}
