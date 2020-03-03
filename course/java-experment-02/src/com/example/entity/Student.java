package com.example.entity;

public class Student {
    private String name;
    private int number;
    private int mark;
    private int classnumber;

    public Student(String name,int number,int mark,int classnumber){
        this.name=name;
        this.number=number;
        this.mark=mark;
        this.classnumber=classnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(int classnumber) {
        this.classnumber = classnumber;
    }
}
