package com.example.entity;

public class Student extends Person {
    private String studentclass;
    private int studentgrade;

    public Student(int usernumber,String username, String studentclass,int studentgrade) {
        super(usernumber,username);
        this.studentclass = studentclass;
        this.studentgrade=studentgrade;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }
}
