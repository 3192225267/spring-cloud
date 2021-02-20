package com.lzh.controller;

import com.lzh.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumeController {
    @Autowired
    private RestTemplate restTemplate;
    // Ribbon 这里的地址，应该是个变量，通过服务名来访问
    //  private static final String REST_URL_PREFIX= "http://localhost:8081";
    private static final String REST_URL_PREFIX= "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getByid(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/queryById/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAllData(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/queryAll",List.class);
    }


    @RequestMapping("/dept/add")
    public boolean addData(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/queryById/",dept,boolean.class);
    }
}
