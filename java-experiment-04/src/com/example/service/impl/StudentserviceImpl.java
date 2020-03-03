package com.example.service.impl;

import com.example.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.example.resourse.*;
import com.example.service.StudentService;

public class StudentserviceImpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
        Database.getStudents().add(student);
        return Database.getStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return Database.getStudents().stream()
                .filter(a->a.getYear()==year)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return Database.getStudents().stream()
                .filter(a->a.getYear()==year)
                .filter(a->sex==a.getSex())
                .map(a->a.getName())
                .collect(Collectors.toList());
    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        return Database.getStudents().stream()
                .collect(Collectors.groupingBy(a->a.getSex()));
    }

    @Override
    public boolean removeStudent(int id) {
        return Database.getStudents().removeIf(a->a.getId()==id);
    }
}
