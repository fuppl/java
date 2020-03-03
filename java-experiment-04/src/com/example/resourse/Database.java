package com.example.resourse;

import com.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Student> students = create();
    private static List<Student> create() {
        students = new ArrayList<>();
        students.add(new Student(201001, Student.Sex.FEMALE, "赵阳阳", 2010));
        students.add(new Student(201002, Student.Sex.MALE, "邵鹏", 2010));
        students.add(new Student(201003, Student.Sex.MALE, "高学斌", 2011));
        students.add(new Student(201004, Student.Sex.MALE, "张扬", 2011));
        students.add(new Student(201005, Student.Sex.FEMALE, "吕惠玲", 2012));
        students.add(new Student(201006, Student.Sex.MALE, "曾志优", 2012));
        return students;
    }

    public static List<Student> getStudents() {
        return students;
    }
}