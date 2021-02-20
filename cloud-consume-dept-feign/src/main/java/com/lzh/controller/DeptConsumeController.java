package com.lzh.controller;

import com.lzh.pojo.Dept;
import com.lzh.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumeController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getByid(@PathVariable("id") Integer id){
        return deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAllData(){
        return deptClientService.queryAll();
    }


    @RequestMapping("/dept/add")
    public boolean addData(Dept dept){
        return deptClientService.addDept(dept);
    }
}
