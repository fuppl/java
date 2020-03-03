package com.example.service.impl;

import com.example.entity.Exam;
import com.example.resource.Database;
import com.example.service.ExamService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExamServiceImpl implements ExamService {
    private static final LocalDate BASE_DATE = LocalDate.of(2019, 2, 25);

    @Override
    public int getWeeks(LocalDate date) {
        return (int)(BASE_DATE.until(date, ChronoUnit.WEEKS)+1);
    }

    @Override
    public List<Exam> listExams(LocalDate date) {
        return  Database.getExams().stream()
                .filter(e->e.getDate().equals(date)).collect(Collectors.toList());
    }

    @Override
    public List<Exam> listExams(LocalDateTime startDateTime) {
        return Database.getExams().stream()
                .filter(e->e.getStartTime().equals(startDateTime))
                .collect(Collectors.toList());
    }

    @Override
    public List<Exam> listExams(int durationMinutes) {
        return Database.getExams().stream()
                .filter(e->e.getStartTime().plusMinutes(durationMinutes)==e.getEndTime()).collect(Collectors.toList());
    }
}
