package com.example.resource;

import com.example.entity.Exam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Database {
    private static List<Exam> exams = create();

    private static List<Exam> create() {
        Exam e1 = new Exam("Java程序设计",
                LocalDate.of(2019, 6, 22),
                LocalTime.of(8, 0),
                LocalTime.of(9, 30));
        Exam e2 = new Exam("数据库原理",
                LocalDate.of(2019, 6, 22),
                LocalTime.of(13, 40),
                LocalTime.of(15, 40));
        Exam e3 = new Exam("计算机网络",
                LocalDate.of(2019, 5, 6),
                LocalTime.of(10, 0),
                LocalTime.of(11, 30));
        Exam e4 = new Exam("用户界面设计",
                LocalDate.of(2019, 5, 6),
                LocalTime.of(15, 30),
                LocalTime.of(17, 0));
        return List.of(e1, e2, e3, e4);
    }

    public static List<Exam> getExams() {
        return exams;
    }

}