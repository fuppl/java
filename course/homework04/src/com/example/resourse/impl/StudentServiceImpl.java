package com.example.resourse.impl;

import com.example.entity.Student;
import com.example.resourse.Database;
import com.example.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public  class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> listStudents() {
        return Database.getStudents();
    }

    @Override
    public  void addStudent(Student stu){
        List<Student>students=Database.getStudents();
        students.add(stu);
    }

    @Override
    public Student getStudent(int sid) {
        Student stu = null;
        for(Student s:Database.getStudents()){
            if(s.getId()==sid)
            stu=s;
        }
        return stu;
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        List<Student>sByYear=new ArrayList<>();
        for(Student s:Database.getStudents()){
            if(s.getId()/10000==year){
                sByYear.add(s);
            }
        }
        return sByYear;
    }
}
