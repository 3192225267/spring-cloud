package com.lzh.dao;

import com.lzh.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    List<Dept> queryAll();
    Boolean addDept(Dept dept);
    Dept queryById(@Param("id") Integer id);
}
