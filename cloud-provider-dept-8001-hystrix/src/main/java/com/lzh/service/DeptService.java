package com.lzh.service;

import com.lzh.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeptService {
    List<Dept> queryAll();
    Boolean addDept(Dept dept);
    Dept queryById(Integer id);
}
