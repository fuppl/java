package com.example;

import com.example.entity.Exam;
import com.example.resource.Database;
import com.*;
import com.example.service.ExamService;
import com.example.service.impl.ExamServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class Test {
    private static final ExamService EXAM_SERVICE= new ExamServiceImpl();
    public static void main(String[] args) {


    }

    public void getWeekTest(){
        System.out.println(EXAM_SERVICE.getWeeks(LocalDate.of(2019, 4, 22)));
    }
    public void listExamTest(){

    }
}
