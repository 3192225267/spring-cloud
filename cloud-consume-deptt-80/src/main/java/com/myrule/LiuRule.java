package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LiuRule {
    @Bean
    public IRule myRule(){
        return new LiuRandomRule();
    }

}
