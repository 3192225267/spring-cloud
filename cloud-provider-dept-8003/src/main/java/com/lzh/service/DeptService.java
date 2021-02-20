package com.lzh.service;

import com.lzh.pojo.Dept;

import java.util.List;


public interface DeptService {
    List<Dept> queryAll();
    Boolean addDept(Dept dept);
    Dept queryById(Integer id);
}
