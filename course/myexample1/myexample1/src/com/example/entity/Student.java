package com.example.entity;

public class Student  {
    private String name;
    private ILearnable iLearnable;//todo 要实现匿名内部类必须将接口变成自己的属性，这样才能setter

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ILearnable getiLearnable() {
        return iLearnable;
    }

    public void setiLearnable(ILearnable iLearnable) {
        this.iLearnable = iLearnable;
    }
}
