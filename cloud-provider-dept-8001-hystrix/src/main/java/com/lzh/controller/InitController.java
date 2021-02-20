package com.lzh.controller;

import com.lzh.pojo.Dept;
import com.lzh.service.impl.DeptClientServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InitController {
    @Autowired
    private DeptClientServiceImpl deptService;

    @PutMapping("/dept/add")
    public String addDept(Dept dept) {
        deptService.addDept(dept);
        return "SECUESS";
    }

    @GetMapping("/dept/queryById/{id}")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    public String queryById(@PathVariable("id") Integer id) {
        Dept dept = deptService.queryById(id);
        if (id == null && dept == null) {
            throw new RuntimeException();
        }
        String data = dept.getName();
        return data;
    }

    public String hystrixQueryById(@PathVariable("id") Integer id) {
        String data = "服务出现错误，请稍后再试";
        return data;
    }

    //    @GetMapping("/dept/queryAll")
//    @ResponseBody
//    @HystrixCommand(fallbackMethod = "hystrixDeptList")
//    public List<String> deptList(){
//        int i = 1/0;
//        List<String> strList = new ArrayList<>();
//        return strList;
//    }
    @GetMapping("/dept/queryAll")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hystrixDeptList")
    public List<Dept> deptList() {
        return deptService.queryAll();
    }

    public List<Dept> hystrixDeptList() {
        List<String> strList = new ArrayList<>();
        strList.add("服务出现错误，请稍后再试");
        return deptService.queryAll();
    }
}
