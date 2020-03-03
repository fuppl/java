package com.example;

import com.example.entity.Student;
import com.example.resourse.Database;
import com.example.service.StudentService;
import com.example.resourse.impl.StudentServiceImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentService ss=new StudentServiceImpl();
        Student student4=new Student(20182345, "d");
        ss.addStudent(student4);
        for(Student s:Database.getStudents())
            System.out.println(s.getId()+s.getName());
        List<Student>d=ss.listStudentsByYear(2017);
        for(Student s:d)
            System.out.println(s.getId()+s.getName());
    }
}
