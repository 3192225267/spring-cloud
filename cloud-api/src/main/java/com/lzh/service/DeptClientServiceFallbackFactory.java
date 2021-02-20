package com.lzh.service;

import com.lzh.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                Dept dept = new Dept();
                dept.setName("因目前服务器访问人数过多，此服务暂时无法正常运行，请稍后重试");
                List<Dept> deptList = new ArrayList<>();
                deptList.add(dept);
                return deptList;
            }

            @Override
            public Dept queryById(Integer id) {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
