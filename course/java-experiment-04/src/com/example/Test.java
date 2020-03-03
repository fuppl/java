package com.example;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.impl.StudentserviceImpl;

import java.util.List;

public class Test {
    private static StudentService s=new StudentserviceImpl();
    public static void main(String[] args) {
        addTest();
        mapTest();
        yearTest();
        year2Test();
        reTest();
    }
    private static void addTest(){
        Student student = new Student(201007, Student.Sex.MALE, "李老四", 2018);
        List<Student> students=s.addStudent(student);
        for(Student stu:students){
            System.out.println(stu.getId()+stu.getName());
        }
    }
    private static void mapTest(){
        s.mapStudentsBySex().get(Student.Sex.MALE);
    }
    private static void yearTest(){
        for(Student stu: s.listStudentsByYear(2011)){
            System.out.println(stu.getName());
        }
    }
    private static void year2Test(){
        for (String stu : s.listStudentsNames(2011, Student.Sex.MALE)) {
            System.out.println(stu);
        }
    }
    private static void reTest(){
        System.out.println(s.removeStudent(201007));
    }
}

