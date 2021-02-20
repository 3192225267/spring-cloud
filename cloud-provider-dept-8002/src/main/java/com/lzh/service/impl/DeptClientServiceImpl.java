package com.lzh.service.impl;


import com.lzh.pojo.Dept;
import com.lzh.dao.DeptDao;
import com.lzh.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptClientServiceImpl implements DeptClientService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

    @Override
    public Boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Integer id) {
        return deptDao.queryById(id);
    }
}
