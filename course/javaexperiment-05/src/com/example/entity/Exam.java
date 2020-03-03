package com.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exam {
    private String courseName;
    // 考试日期
    private LocalDate date;
    // 考试开始时间
    private LocalTime startTime;
    private LocalTime endTime;

    public Exam(String courseName, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.courseName = courseName;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}