package com.example;

import com.example.entity.Student;
import com.example.entity.Teacher;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import com.example.service.impl.StudentServiceImpl;
import com.example.service.impl.TeacherServiceImpl;

public class Test {
    public static void main(String[] args) {
        studentServiceTest();
        System.out.println("-------------");
        teacherServiceTest();
    }

    private static void studentServiceTest() {
        StudentService studentService = new StudentServiceImpl();
        System.out.println(studentService.findbyusernumber(1).getUsername());
        System.out.println(studentService.average("2ban"));
    }

    private static void teacherServiceTest() {
        TeacherService teacherService = new TeacherServiceImpl();
        System.out.println(teacherService.findbyusernumber(4).getUsername());
        System.out.println(teacherService.publishzongnumber("lecture"));
    }
}