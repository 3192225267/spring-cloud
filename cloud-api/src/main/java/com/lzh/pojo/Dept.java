package com.lzh.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer id;
    private String name;
    private String db;

    public Dept() {
    }

    public Dept(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
