package com.example.resourse;

import com.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Student>students=create();
    private static List<Student>create(){
        List<Student>students=new ArrayList<>();
        Student student1=new Student(20171234, "a");
        Student student2=new Student(20172345, "b");
        Student student3=new Student(20181234, "c");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
    public static List<Student>getStudents(){
        return students;
    }
}
