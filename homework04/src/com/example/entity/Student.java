package com.example.entity;

public class Student {
    /**
     * 编号8位，前4位代表入学年份
     * 例如，2010_0110, 2017_8425
     */
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
