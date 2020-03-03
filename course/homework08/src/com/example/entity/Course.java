package com.example.entity;

import java.util.List;

public class Course {
    private String cname;
    private Teacher teacher;
    private List<Student> students;

    public Course(String cname, Teacher teacher, List<Student> students) {
        this.cname = cname;
        this.teacher = teacher;
        this.students = students;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
