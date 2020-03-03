package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 返回当前全部学生
     * @return
     */
    List<Student> listStudents();

    /**
     * 向源添加一个对象
     * @param stu
     */
    void addStudent(Student stu);

    /**
     * 获取指定学号的学生
     * @param sid
     * @return
     */
    Student getStudent(int sid);

    /**
     * 基于指定年级，返回全部学生
     * 思路：创建一个新集合，遍历database中的原始集合，判断，添加到新集合，返回新集合
     * !!没有返回空集合对象!!而非空引用null
     * @param year
     * @return
     */
    List<Student> listStudentsByYear(int year);
}
