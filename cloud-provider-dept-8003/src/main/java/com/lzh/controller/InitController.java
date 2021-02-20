package com.lzh.controller;

import com.lzh.pojo.Dept;
import com.lzh.service.impl.DeptClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InitController {
    @Autowired
    private DeptClientServiceImpl deptService;

    @PutMapping("/dept/add")
    public String addDept(Dept dept){
        deptService.addDept(dept);
        return "SECUESS";
    }

    @GetMapping("/dept/queryById/{id}")
    @ResponseBody
    public String queryById(@PathVariable("id") Integer id){
        Dept dept = deptService.queryById(id);
        String data = dept.getName();
        return  data;
    }

    @GetMapping("/dept/queryAll")
    @ResponseBody
    public List<Dept> deptList(){
        System.out.println("3");
        return deptService.queryAll();
    }
}
