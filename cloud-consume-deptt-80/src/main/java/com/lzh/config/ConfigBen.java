package com.lzh.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBen {

    @Bean
    // 配置负载均衡  实现
    // IRule
    // RoundRobinRule 轮询
    // RandomRule 随机
    // AvailabilityFilteringRule ：会先过滤到，跳闸，访问故障的服务~，对剩下的轮询
    // RetryRule : 会先按照轮询获取服务~，如果服务获取失败，则会在指定的时间内进行，重试
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


}
