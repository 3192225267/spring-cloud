package com.lzh.service;

import com.lzh.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
@Component
public interface DeptClientService {
    @RequestMapping("/dept/queryAll")
    List<Dept> queryAll();
    @RequestMapping("/dept/queryById/{id}")
    Dept queryById(@PathVariable("id") Integer id);
    @RequestMapping("/dept/add")
    Boolean addDept(Dept dept);
}
