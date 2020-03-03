package com.homework01;
import com.homework01.entity.Student;

public class Test {
    public static void main(String[] args) {
    Student stu=new Student("老四", 2017214239, "软件工程", "male");
        System.out.println(stu.getName());
        System.out.println(stu.getNumber());
        System.out.println(stu.getMajor());
        System.out.println(stu.getSex());

    }
}
